package Misc;

public class DivideInteger {
    public static int devide(int divident, int divisor){
        int ndivident = divident;
        int ndivisor = divisor;
        if(divident<0)
            ndivident= ~divident+1;
        if(divisor < 0) ndivisor = ~divisor+1;
        int res = 0;
        while (ndivident - ndivisor >= 0){
            ndivident = ndivident - ndivisor;
            res++;
        }
        if(divident>0 && divisor <0 || divident<0 && divisor >0 || res <0){
            res = ~res+1;
            System.out.println("here");
        }
        if(divident==Integer.MIN_VALUE && divisor==1)
            return divident;
        return res;
    }
    public static void main(String[] args) {
        int num = -2147483648;
        int div = 1;
        //int div =~d+1;
        System.out.println(devide(num,div));
        System.out.println(Integer.MIN_VALUE);

    }
}
