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
}
