package Misc;

import java.util.*;
import  java.io.*;


public class MaxDictSubString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String S = br.readLine();

        int out_ = SmallestSubString(S);
        wr.println(out_);

        wr.close();
        br.close();
    }

    static int SmallestSubString(String S) {
        // Write your code here
        int size = S.length();
        int start_index =0;
        int max_dict =0;
        int count =0;
        Map<Character,Integer> table = new HashMap<>();
        for(int i =0; i<size;i++){
            if(!table.containsKey(S.charAt(i))){
                table.put(S.charAt(i),i);
                count++;

            }
            else if(table.containsKey(S.charAt(i) ) && table.get(S.charAt(i)) >= start_index){
                start_index= table.get(S.charAt(i))+1;
                table.put(S.charAt(i),i);
                count = count - start_index+1;
            }

            max_dict = Math.max(max_dict,count);
        }
        return max_dict;

    }
}
