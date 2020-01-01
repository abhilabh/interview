package Misc;

import java.util.ArrayList;
import java.util.List;

public class MissingNum {
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> ret = new ArrayList<>();
        int size = A.size();
        int sumN = ((size)*(size +1))/2;
        int fact = 1;
        for (int i =1;i<=size;i++){
            fact*=i;
        }
        int factA = 1;
        int sumA= 0;
        for (int i =0;i<size;i++){
            factA*=A.get(i);
            sumA+=A.get(i);
        }
        int diff = sumN -sumA;
        for(int i=0;i<size;i++){
            int curProd = (factA*(A.get(i)+diff))/A.get(i);
            if(curProd == fact){
                ret.add(A.get(i));
                ret.add(A.get(i)+diff);
                break;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        MissingNum x = new MissingNum();
        List<Integer> a = new ArrayList<Integer>();
        int arr[] = {3 ,1 ,2, 5 ,3};
        for (int i=0;i<arr.length;i++){
            a.add(arr[i]);
        }
        x.repeatedNumber(a);

    }
}
