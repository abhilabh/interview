package Misc;

public class Coin {
    public int min(int x, int y){
        return x<y?x:y;
    }
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        for(int i =1;i<=amount;i++){
            for(int j =0;j<coins.length;j++){
                if(amount - coins[j]>=0){
                    if(dp[i]==0) dp[i]=dp[amount - coins[j]]+1;
                    else
                        dp[i] = min(dp[i],dp[amount - coins[j]]+1);
                }
            }
        }
        return dp[amount];

    }
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
    public int integerBreak(int n) {
        int dp[]= new int[n+1];
        dp[2]=1;
        int i=3;
        while(i<=n){
            dp[i]=(i-1)*dp[i-1];
            i++;
        }
        return dp[n];

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
        //System.out.println(c.coinCount(a,11));
        //System.out.println(c.coinChange(a,11));
        System.out.println(c.integerBreak(6));
    }
}
