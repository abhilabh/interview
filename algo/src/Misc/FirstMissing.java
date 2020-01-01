package Misc;

import java.util.ArrayList;
import java.util.List;

public class FirstMissing {
    void swap(ArrayList<Integer> A, int i, int j){
        int temp = A.get(i);
        A.set(i,A.get(j));
        A.set(j,temp);

    }
    int rearrange(ArrayList<Integer> A){
        int i = 0;
        int j = A.size()-1;
        while(i<j){
            if(A.get(i)>0 && A.get(j)<0){
                swap(A,i,j);
                i++;
                j--;
                continue;
            }
            if(A.get(i)<0) i++;
            if(A.get(j)>0) j--;
        }
        return j;
    }
    public int firstMissingPositive(ArrayList<Integer> A) {
        int pos = rearrange(A);
        if(pos == -1) pos=0;
        if(A.get(pos)<0){
            if(pos==A.size()-1) return 1;
            pos+=1;
        }
        if(pos == -1) return -1;
        for(int i=pos;i<A.size();i++){
            if(Math.abs(A.get(i))>A.size() -pos) continue;
            A.set(Math.abs(A.get(i))-1+pos, -A.get(pos -1+Math.abs(A.get(i))));

        }
        for(int i=pos;i<A.size();i++){
            if(A.get(i)>0){
                return i -pos +1;
            }
        }
        return A.size() - pos +1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int arr[]={1, -2, 3, -4, 5, -6, 7, -8, 9, -10 };
        for (int i=0;i<arr.length;i++){
            a.add(arr[i]);
        }
        FirstMissing x = new FirstMissing();
        System.out.println(x.firstMissingPositive(a));
    }
}
