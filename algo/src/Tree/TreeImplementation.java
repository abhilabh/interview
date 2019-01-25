package Tree;

/**
 * Created by abhilabh on 1/25/19.
 */
public class TreeImplementation {

    public Node root;
    public class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data =data;
        }
    }
    public TreeImplementation insertBst(TreeImplementation tree, int data){
        Node new_node = new Node(data);
        Node prev = null;
        if(tree.root == null){
            tree.root = new_node;
        }else{
            Node temp = tree.root;
            while (temp != null){
                prev = temp;
                if(data <= temp.data){
                    temp = temp.left;
                }else{
                    temp = temp.right;
                }
            }
            if(data <= prev.data) prev.left = new_node;
            else prev.right = new_node;
        }
        return tree;
    }

    public Node preSuccessor(Node node){
        while (node.left != null){
            node = node.left;
        }

        return node;
    }
    public Node delete(Node tree,int data){
        if(tree == null) return tree;
        if(data < tree.data){
            tree.left = delete(tree.left,data);
        }
        else if(data > tree.data){
            tree.right = delete(tree.right, data);
        }
        else {
            if (tree.left == null) {
                return tree.right;
            } else if (tree.right == null) {
                return tree.left;
            }


            tree.data = preSuccessor(tree.right).data;
            tree.right = delete(tree.right, tree.data);

        }

        return tree;


    }
    public void inorderTravalsal(Node tree){
        if(tree != null){
            inorderTravalsal(tree.left);
            System.out.print("\t"+tree.data);
            inorderTravalsal(tree.right);
        }
    }

    public void preorderTravalsal(Node tree){
        if(tree != null){
            System.out.print("\t"+tree.data);
            inorderTravalsal(tree.left);
            inorderTravalsal(tree.right);
        }
    }
    public void postorderTravalsal(Node tree){
        if(tree != null){
            inorderTravalsal(tree.left);
            inorderTravalsal(tree.right);
            System.out.print("\t"+tree.data);
        }
    }
}
