package Misc;

public class RollDice {
    public int dieSimulator(int n, int[] rollMax) {

        int dp[][] = new int[n][rollMax.length];
        int diff =0;
        int newRollMax[] = new int[rollMax.length];
        for(int i=0;i<rollMax.length;i++){
            newRollMax[i]=rollMax[i]-1;
        }
        int total=6;
        for(int i=1; i<n;i++){
            total*=6;
            int sum = 0;
            diff=0;
            for(int j=0;j<rollMax.length;j++){
                sum = dp[i-1][j]*6;
                if(newRollMax[j]==0){
                    sum+=1;
                    newRollMax[j]= rollMax[j];

                }
                else{
                    newRollMax[j]--;
                }
                for(int k=0;k<6;k++){
                    if(j!=k)
                        sum+=dp[i-1][k];
                }
                diff+=sum;
                dp[i][j]=sum;
            }
            System.out.println(diff);

        }

        return total -diff;

    }

    public static void main(String[] args) {
        RollDice x = new RollDice();
        int y[]={1,1,1,2,2,3};
        System.out.println(x.dieSimulator(4,y));
    }
}
