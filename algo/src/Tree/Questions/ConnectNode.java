package Tree.Questions;

class Tree {
    Tree left;
    Tree right;
    Tree next;
    int val;
    Tree(int val1){
        left = null;
        right = null;
        next = null;
        val = val1;
    }

}

public class ConnectNode {
    Tree root;
    public Tree findNext(Tree root, Tree x){
        if(x == root.left)
        if(root.right!=null) return root.right;
        Tree next = root.next;
        while(next!=null){
            if(next.left!=null) return next.left;
            if(next.right!=null) return next.right;
            next = next.next;
        }
        return null;

    }
    public Tree connect(Tree root) {
        if(root==null) return null;
        System.out.print(root.val);
        if(root.left!=null) root.left.next = findNext(root, root.left);
        if(root.right!=null) root.right.next = findNext(root, root.right);
        connect(root.left);
        connect(root.right);
        return root;

    }
    public static void main(String[] args) {
        ConnectNode tree = new ConnectNode();
        tree.root = new Tree(2);
        tree.root.left = new Tree(1);
        tree.root.right = new Tree(3);
        tree.root.left.left = new Tree(0);
        tree.root.left.left.left = new Tree(2);
        tree.root.left.right = new Tree(7);
        tree.root.left.right.left = new Tree(1);
        tree.root.left.right.right = new Tree(0);
        tree.root.left.right.right.left = new Tree(7);
        tree.root.right.left = new Tree(9);
        tree.root.right.right = new Tree(1);
        tree.root.right.right.left = new Tree(8);
        tree.root.right.right.right = new Tree(8);
        tree.connect(tree.root);
    }
}
