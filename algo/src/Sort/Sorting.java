package Sort;

/**
 * Created by abhilabh on 1/24/19.
 */
public class Sorting implements Sort {
    public void swap(int[] a,int i,int j){
        int temp= a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public int parition(int[] arr,int low,int high){
        //{1, 4, 45, 6, 10, 8}
        int pi = arr[high];
        int i = low-1;
        for(int j=low;j<=high -1;j++){
            if(arr[j]<=pi){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
      /*  for (int k:arr) {
            System.out.println(k);

        }*/
        return i+1;
    }
    @Override
    public void quickSort(int[] a, int start, int end) {
        if (start<end) {
            int pi = parition(a, start, end);
            quickSort(a, start, pi - 1);
            quickSort(a, pi + 1, end);
        }
    }
    public void heapify(int[] arr,int low,int high){
        int l=0,r=0;
        for(int i=(high/2)-1;i>=0;i--){
            l= 2*i+1;
            r= 2*i+2;
            if(arr[i]<arr[l]) swap(arr,i,l);
            if(r<high && arr[i]<arr[r]) swap(arr,i,r);
        }
        swap(arr,0,high-1);
    }

    @Override
    public void heapSort(int[] a, int start, int end) {
        for(int i=0;i<end;i++){
            heapify(a,start,end-i);
        }
    }

    public void merge(int[] arr,int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int[] A= new int[n1];
        int[] B= new int[n2];
        for(int i=0;i<n1;i++) {
            A[i] = arr[low + i];
        }
        for (int i=0;i<n2;i++){
            B[i] = arr[mid+1+i];
        }
        int i=0,j=0,k=low;
        while (i<n1&&j<n2){
            if(A[i]<B[j]){
                arr[k++]=A[i++];
            }
            else{
                arr[k++]=B[j++];
            }
        }
        if(i>=n1){
            while(j<n2){
                arr[k++]=B[j++];
            }
        }
        if(j>=n2){
            while (i<n1){
                arr[k++]=A[i++];
            }
        }
    }

    @Override
    public void mergeSort(int[] a, int start, int end) {
        if(start<end){
            int mid= (start+end)/2;
            mergeSort(a,start,mid);
            mergeSort(a,mid+1,end);
            merge(a,start,mid,end);
        }
    }
}
