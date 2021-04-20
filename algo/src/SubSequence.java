public class SubSequence {
    public void subSeq(String str, String output){
        if(str.length() == 0){
            System.out.println(output);
            return;
        }
        subSeq(str.substring(1), output+str.charAt(0));
        subSeq(str.substring(1), output);


    }
    public void printAllSubSum(int []arr, int i, int j, int sum){
        if(i >= j ){
            if(sum > 0)
            System.out.println(sum);
            return;
        }
        printAllSubSum(arr, i+1, j, sum + arr[i]);
        printAllSubSum(arr, i+1, j, sum );
    }
    public static void main(String[] args) {
        SubSequence Sub = new SubSequence();
        String str = "abcd";
        int arr[] = {1,2,3};
        //Sub.subSeq(str, "");
        Sub.printAllSubSum(arr, 0, 3, 0);

    }
}
