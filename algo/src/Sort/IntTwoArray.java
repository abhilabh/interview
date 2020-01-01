package Sort;

import java.util.ArrayList;
import java.util.List;

public class IntTwoArray {
    public boolean binary(List<Integer> A, int start, int end,int target){
        if(start<=end){
            int mid = (start + end)/2;
            if(A.get(mid)==target) return true;
            else if(target < A.get(mid)) binary(A,start,mid-1,target);
            else binary(A,mid+1,end,target);
        }
        return false;
    }
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> temp = new ArrayList<>();
        List<Integer> X;
        List<Integer> Y;
        if(A.size()>B.size()){
            X = A;
            Y = B;
        }
        else{
            X=B;
            Y=A;
        }
        for(int i=0;i<Y.size();i++){
            if(binary(X,0,X.size()-1,Y.get(i))){
                temp.add(Y.get(i));
            }
        }
        return temp;
    }
    public ArrayList<Integer> intersect1(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i =0;
        int j =0;
        while(i<A.size() && j < B.size()){
            if(A.get(i).intValue() == B.get(j).intValue()){
                temp.add(A.get(i));
                i++;
                j++;
            }
            else if(A.get(i)<B.get(j)) i++;
            else j++;
        }
        return temp;
    }

    public static void main(String[] args) {
        int A[] = {1, 3, 8, 10, 13, 13, 16, 16, 16, 18, 21, 23, 24, 31, 31, 31, 33, 35, 35, 37, 37, 38, 40, 41, 43, 47, 47, 48, 48, 52, 52, 53, 53, 55, 56, 60, 60, 61, 61, 63, 63, 64, 66, 67, 67, 68, 69, 71, 80, 80, 80, 80, 80, 80, 81, 85, 87, 87, 88, 89, 90, 94, 95, 97, 98, 98, 100, 101};
        int B[] = { 5, 7, 14, 14, 25, 28, 28, 34, 35, 38, 38, 39, 46, 53, 65, 67, 69, 70, 78, 82, 94, 94, 98};
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();


        /*for (int i=0;i<A.length;i++){
            a.add(A[i]);
        }
        for (int i=0;i<B.length;i++){
            b.add(B[i]);
        }*/
        a.add(1000000);
        b.add(1000000);
        IntTwoArray x = new IntTwoArray();
        x.intersect1(a,b);



    }

}
