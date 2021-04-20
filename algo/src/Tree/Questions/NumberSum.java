/*
Given a binary tree, where every node value is a Digit from 1-9 .Find the sum of all the numbers which are formed from root to leaf paths.
 return sum to previous node which is the root of leaf node;
 */

package Tree.Questions;
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class NumberSum {

    /* Another solution similar to left + right side sum
    int treePathsSumUtil(Node node, int val)
    {
        // Base case
        if (node == null)
            return 0;

        // Update val
        val = (val * 10 + node.data);

        // if current node is leaf, return the current value of val
        if (node.left == null && node.right == null)
            return val;

        // recur sum of values for left and right subtree
        return treePathsSumUtil(node.left, val)
                + treePathsSumUtil(node.right, val);
    }
     */
    public int printSum(Node root, String num, int sum){
        if(root!=null){
             sum = printSum(root.left, num + String.valueOf(root.data), sum);
             sum = printSum(root.right,num + String.valueOf(root.data), sum);
             if(root.left == null && root.right == null)
                 return sum + Integer.parseInt(num+String.valueOf(root.data));
        }
        return sum;

    }
    Node root;
    public static void main(String[] args) {
        NumberSum tree = new NumberSum();
        tree.root = new Node(6);
        tree.root.left = new Node(3);
        tree.root.right = new Node(5);
        tree.root.right.right = new Node(4);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(5);
        tree.root.left.right.right = new Node(4);
        tree.root.left.right.left = new Node(7);
        System.out.println(tree.printSum(tree.root,"",0));
    }
}
