import LinkedList.LinkedInt;
import Sort.Sorting;

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
        Sorting test = new Sorting();
        //test.quickSort(A,0,A.length-1);
        //test.heapSort(A,0,A.length);
        //test.mergeSort(A,0,A.length-1);
       // printArray(A);
        LinkedInt list =new LinkedInt();
        list = list.insertNode(list, 1);
        list = list.insertNode(list, 2);
        list = list.insertNode(list, 3);
        list = list.insertNode(list, 4);
        list = list.insertNode(list, 5);
        list = list.insertNode(list, 6);
        list = list.insertNode(list, 7);
        list = list.insertNode(list, 8);
        list.printList(list);
    }
}
