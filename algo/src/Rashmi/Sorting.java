package Rashmi;

public class Sorting {
    void print(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }

    public static void main(String[] args) {
        Sorting test = new Sorting();
        int[] arr = {2,10,3,25,4};
        test.print(arr);

    }

}
