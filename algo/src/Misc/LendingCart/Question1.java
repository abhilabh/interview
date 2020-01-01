package Misc.LendingCart;


import java.util.List;

public class Question1 {
    static String dayOfProgrammer(int year) {
        String S = "";
        System.out.println(year%400);
        if(year%400==0 || (year%4 == 0 && year%100!=0)){
            System.out.print(year%400);
            return "12.09."+ year;
        }

        return "13.09."+ year;


    }
    public int min(int x, int y){
        return x<y?x:y;
    }
    int minUtils(List<List<Integer>> arr, int R, int C, int sum){
        if(R == arr.size()-1){
            return arr.get(C).get(R);
        }
        int left = minUtils(arr,R+1,C,sum+ arr.get(C).get(R));
        int right = minUtils(arr,R+1,C+1,sum+ arr.get(C).get(R));

        return arr.get(C).get(R)+ min(left,right);
    }

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(1800));
    }
}
