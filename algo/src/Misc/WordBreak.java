package Misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        HashMap<String,Integer> key = new HashMap<>();
        for(String word: wordDict){
            key.put(word,1);
        }
        int l = 0;
        while(l<s.length()){

            //int k = 0;
            for(int i = 0; i+l<s.length();i++){
                int j = i+l;
                if(key.containsKey(s.substring(i,j+1))){
                    dp[i][j]= true;

                }
                else{
                    for(int k =i; k<j;k++)
                    {
                        if(dp[i][k]==true && dp[k+1][j]==true){
                            dp[i][j] = true;
                            break;
                        }

                    }

                }
            }
            l++;
        }
        return dp[s.length()-1][s.length()-1];
    }

    public static void main(String[] args) {
        List<String> word = new ArrayList<>();
        WordBreak x = new WordBreak();
        word.add("le");
        word.add("et");
        System.out.println(x.wordBreak("leet",word));

    }

}
