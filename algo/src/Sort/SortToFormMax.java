package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortToFormMax {
    public int max(int x, int y){
        String S1= Integer.toString(x);
        String S2 = Integer.toString(y);
        int XY = Integer.valueOf(S1+S2);
        int YX = Integer.valueOf(S2+S1);
        return XY >YX? x:y;
    }
    public void mergeutils(List<Integer> arr, int start, int end, int mid){
        int l= mid - start+1;
        int m = end - mid;
        int A[] = new int[l];
        int B[] = new int[m];
        int b=0;
        for(int i =0 ; i<=end-start;i++){
            if(i<l) A[i]=arr.get(start+i);
            else B[b++]=arr.get(start+i);
        }
        int i = 0;
        int j = 0;
        int n = 0;
        while(i<l && j <m){

            if(max(A[i],B[j])==A[i]){
                arr.set(start+n,A[i]);
                i++;
            }
            else {

                arr.set(start+n,B[j]);
                j++;
            }
            n++;

        }
        while(i<l){
            arr.set(start+n,A[i]);
            i++;
            n++;
        }
        while(j<m){
            arr.set(start+n,B[j]);
            j++;
            n++;
        }
    }
    public void merge(List<Integer> arr,int start, int end){
        if(start<end) {
            int mid = (start + end) / 2;
            merge(arr, start, mid);
            merge(arr, mid + 1, end);
            mergeutils(arr, start,end,mid);
        }

    }

    public static void main(String[] args) {
        int arr[]={3, 30, 34, 5, 9};
        List<Integer> L = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            L.add(arr[i]);
        }
        SortToFormMax x = new SortToFormMax();
        x.merge(L, 0, L.size()-1);
        return;
    }
}
