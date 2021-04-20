public class MaxContSeq {

    public void fillTable(int []arr, int i, int j, int[] table,int sum){
        if(i >= j ){
            if(sum > 0)
                table[sum] = 1;
            return;
        }
        fillTable(arr, i+1, j, table, sum + arr[i]);
    }

    public int getMaximumConsecutive(int[] coins) {
        int sum =0;
        for(int i =0;i<coins.length; i++){
            sum+=coins[i];
        }
        int table[] = new int[sum+1];
        int count = 0;
        int max = 0;
        table[0] =1;
        fillTable(coins, 0 , coins.length, table, 0);
        for(int i =0; i<=sum; i++){
            //System.out.print(table[i]);
            if(table[i] == 1){
                count++;
                max = Math.max(max,count);
            }
            else count = 0;
        }
        return max;

    }
    public static void main(String[] args) {
        MaxContSeq M1 = new MaxContSeq();
        int[] coins = {1,3};
        System.out.println(M1.getMaximumConsecutive(coins));
    }
}
