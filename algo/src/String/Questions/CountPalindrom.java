package String.Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountPalindrom {
    public static String keyGen(String S,int i,int j){
        String res = "";
        while(i<=j){
            res+=S.charAt(i);
            i++;
        }
        return res;
    }
    public static int countPalindrom(String S, int n){
        int count =0;
        int table[][]= new int[n][n];
        Map<String,Integer> m = new HashMap<>();
        for(int i=0;i<n;i++){
            table[i][i]=1;
            String key = keyGen(S,i,i);
            if(!m.containsKey(key)) m.put(key,1);
        }
        for(int i=1;i<n;i++){
            if(S.charAt(i-1)==S.charAt(i)){
                table[i-1][i]=1;
                String key = keyGen(S,i-1,i);
                if(!m.containsKey(key)) m.put(key,1);
            }

        }
        for(int k=3; k<n;k++){
            for(int j=0;j<n-k+1;j++){
                int t = j+k-1;
                if(table[j+1][t-1]==1 && S.charAt(j)==S.charAt(t)){
                    table[j][t]=1;
                    String key = keyGen(S,j,t);
                    if(!m.containsKey(key)) m.put(key,1);
                }
            }
        }
        for (int i=0;i<n;i++) {
            for (int j = 0; j<n;j++)
                System.out.print(table[i][j]+" ");
            System.out.println();
            System.out.println();
        }
        System.out.println(m);
        return m.size();
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        int result[] = new int[test];
        for (int i = 0; i < test; i++) {
            String S = input.next();

            result[i] = countPalindrom(S, S.length());
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "\n");
        }
    }
}
