package Tree;

/**
 * Created by abhilabh on 1/25/19.
 */
public class AvlTreeImpl {

    public Node root;
    public class Node{
        int key;
        Node left,right;
        int h;
        Node(int key){
            this.key = key;
            h=1;
        }
    }
    public int max(int x, int y){
        if(x>y) return x;
        else return y;
    }

    public int getHeight(Node node){
        if (node == null){
            return 0;
        }
        return node.h;
    }

    public Node rightRotate(Node x){
        Node y = x.left;
        x.left = y.right;
        y.right = x;
        x.h = 1+ max(getHeight(x.left),getHeight(x.right));
        y.h = 1+ max(getHeight(y.left),getHeight(y.right));

        return y;
    }

    public Node leftRotate(Node x){
        Node y = x.right;
        x.right = y.left;
        y.left = x;
        x.h = 1+ max(getHeight(x.left),getHeight(x.right));
        y.h = 1+ max(getHeight(y.left),getHeight(y.right));

        return y;
    }

    public Node insert(Node node, int key){
        if(node == null)
            return new Node(key);
        if(key < node.key){
            node.left = insert(node.left,key);
        }
        else node.right = insert(node.right, key);

        node.h = 1 + max(getHeight(node.left),getHeight(node.right));

        int balance = getHeight(node.left ) - getHeight(node.right);

        if(balance >1 && key < node.left.key){
            return rightRotate(node);
        }
        if(balance <-1 && key > node.right.key){
            return leftRotate(node);
        }
        if(balance >1 && key > node.left.key){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if(balance < -1 && key < node.right.key){
            node.right=rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void inOrderPrint(Node node){
        if(node != null){
            inOrderPrint(node.left);
            System.out.print("key= "+node.key+" h= "+node.h);
            inOrderPrint(node.right);
        }
    }
}
