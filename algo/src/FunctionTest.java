import LinkedList.DoublyLinkedList;
import LinkedList.LinkedInt;
import Sort.Sorting;
import Tree.AvlTreeImpl;
import Tree.TreeImplementation;

/**
 * Created by abhilabh on 1/24/19.
 */
public class FunctionTest {
    public static void printArray(int[] A){
        for (int i:A) {
            System.out.println("\t"+i);

        }
    }
    public static void main(String args[]) {
        int A[] = {1, 4, 45, 6, 10, 8};
        //Sorting test = new Sorting();
        //test.quickSort(A,0,A.length-1);
        //test.heapSort(A,0,A.length);
        //test.mergeSort(A,0,A.length-1);
       // printArray(A);
        /*LinkedInt list =new LinkedInt();
        list = list.insertNode(list, 1);
        list = list.insertNode(list, 2);
        list = list.insertNode(list, 3);
        list = list.insertNode(list, 4);
        list = list.insertNode(list, 5);
        list = list.insertNode(list, 6);
        list = list.insertNode(list, 7);
        list = list.insertNode(list, 8);
        list.printList(list);

        list = list.deleteNode(list,1);
        list = list.deleteNode(list,4);
        list = list.deleteNode(list,8);
        list.printList(list);*/


        TreeImplementation tree = new TreeImplementation();
        tree = tree.insertBst(tree,5);
        tree = tree.insertBst(tree,7);
        tree = tree.insertBst(tree,25);
        tree = tree.insertBst(tree,14);
        tree = tree.insertBst(tree,2);
        tree = tree.insertBst(tree,48);
        tree = tree.insertBst(tree,12);

        tree.inorderTravalsal(tree.root);
       // tree.preorderTravalsal(tree.root);
       // tree.postorderTravalsal(tree.root);

        tree.root = tree.delete(tree.root, 25);
        tree.root = tree.delete(tree.root, 48);
        tree.inorderTravalsal(tree.root);



        /*
        DoublyLinkedList list = new DoublyLinkedList();
        list = list.insert(list, 1);
        list = list.insert(list, 2);
        list = list.insert(list, 3);
        list = list.insert(list, 4);
        list = list.insert(list, 5);
        list = list.insert(list, 6);
        list = list.insert(list, 7);
        list = list.insert(list, 8);
        list.printList(list);

        System.out.println("\n");

        list.delete(list,1);
        list.delete(list,4);
        list.delete(list,8);
        list.printList(list);
        */

        /*
        AvlTreeImpl tree = new AvlTreeImpl();
        tree.root = tree.insert(tree.root,10);
        tree.root = tree.insert(tree.root,5);
        tree.root = tree.insert(tree.root,3);


        tree.inOrderPrint(tree.root);
        */
    }
}
