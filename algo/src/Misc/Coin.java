package Misc;

public class Coin {
    /*not completed yet*/
    public int count(int a[],int sum){
        int dSum[] = new int[sum+1];
        dSum[0]=1;
        for(int i=1;i<=sum;i++){
            for(int j = 0; j<a.length;j++){
                if(i-a[j] >= 0) dSum[i] += dSum[i-a[j]];
            }
        }
        for(int c=0;c<=sum;c++){
        System.out.println(c+" "+dSum[c]);}
        return dSum[sum];
    }
    /* with recursion
    public int count(int a[],int m, int sum){
        if(sum==0)
            return 1;
        if(sum<0 || m >=a.length) return 0;


        return count(a,m,sum-a[m])+count(a,m+1,sum);
    }*/
    public int coinCount(int a[], int sum){
        return count(a,sum);
    }
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int sum = 5;
        Coin c = new Coin();
        System.out.println(c.coinCount(a,11));
    }
}
