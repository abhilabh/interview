package Misc;

import java.util.ArrayList;
import java.util.List;

public class sortColor {
    public void sortColors(ArrayList<Integer> a) {
        int red = 0;
        int white =0;
        int blue =0;
        for(int i=0;i<a.size();i++){
            if(a.get(i).intValue() == 0) red++;
            else if(a.get(i).intValue() == 1) white++;
            else blue++;
        }
        System.out.println(red);
        System.out.println(white);
        System.out.println(blue);
        for(int i=0;i<a.size();i++){
            if(i < red) a.set(i,0);
            else if(i < white) a.set(i,1);
            else a.set(i,2);
        }
    }

    public static void main(String[] args) {
        int A[] = {2, 0, 0, 1, 0, 0, 2, 2, 1, 1, 0, 0, 1, 0, 2, 1, 1, 0, 1, 0, 1, 2, 2, 2, 0, 0, 1, 0, 2, 1, 1, 2, 1, 2, 2, 1, 0, 2, 2, 1, 1, 1, 0, 1, 0, 1, 0, 2, 1, 2, 0, 2, 0, 1, 1, 0, 2, 2, 1, 2, 0, 2, 1, 1, 1, 2, 0, 1, 0, 2, 2, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 2, 1, 1, 0, 2, 1, 2, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 1, 1, 0, 2, 1, 2, 2, 2, 1, 2, 2, 0, 1, 0, 1, 2, 1, 1, 0, 1, 2, 0, 1, 0, 2, 2, 1, 2, 1, 0, 2, 2, 1, 1, 0, 2, 1, 2};
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i=0;i<A.length;i++){
            a.add(A[i]);
        }
        sortColor x = new sortColor();
        x.sortColors(a);

    }
}
