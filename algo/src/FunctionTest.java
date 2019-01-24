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
        test.mergeSort(A,0,A.length-1);
        printArray(A);
    }
}
