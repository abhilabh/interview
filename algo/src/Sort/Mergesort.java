package Sort;

public class Mergesort {
    /*
    function which devide the array to 2 half and perform merge
     */
    public void mergeutils(int arr[],int start,int end,int mid){
        int l= mid - start+1;//1st array length
        int m = end - mid;//2nd array length
        int A[] = new int[l];//1st array
        int B[] = new int[m];//2nd array
        int b=0;//for 2nd array
        //code to copy value in 1st and 2nd array
        for(int i =0 ; i<=end-start;i++){
            if(i<l) A[i]=arr[start+i];
            else B[b++]=arr[start+i];
        }
        int i = 0;
        int j = 0;
        int n = 0;
        //perform merge till any array is empty
        while(i<l && j <m){

            if(A[i]<=B[j]){
                arr[start+n]= A[i];
                i++;
            }
            else {
                arr[start+n]= B[j];
                j++;
            }
            n++;

        }
        //copy all the element if no element left in 2nd array
        while(i<l){
            arr[start+n]= A[i];
            i++;
            n++;
        }
        //copy all the element if no element left in 1st array
        while(j<m){
            arr[start+n]=B[j];
            j++;
            n++;
        }
    }
    public void merge(int arr[],int start, int end){
        /*
        function to devide array recursively
         */
        if(start<end) {
            int mid = (start + end) / 2;
            merge(arr, start, mid);
            merge(arr, mid + 1, end);
            mergeutils(arr, start,end,mid);
        }

    }
    public void sort(int arr[]){
        int size = arr.length;
        merge(arr,0,size-1);

    }
    public static void main(String[] args) {
        int arr[]={2,6,3,15,4,10,1};
        Mergesort s = new Mergesort();
        s.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

    }
}
