package Sort;

/* IMPORTANT: Multiple classes and nested static classes are supported */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class FindChocklateIndex {
    static void findIndex(int[] sum, int s){
        int start = 0;
        int end = sum.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(start == end){
                if(s == sum[start]){
                    System.out.println(start);
                }
                else if(s<sum[start]){
                    System.out.println(start+1);
                }
                System.out.println(start-1);
            }
            if(s<sum[mid]) end = mid -1;
            else start = mid +1;
        }
    }
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int[] sum = new int[n];
        sum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + arr[i];
        }
        int test = s.nextInt();
        for (int i = 0; i < test; i++) {
            findIndex(sum, s.nextInt());
        }
    }
}

