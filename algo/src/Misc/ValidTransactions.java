package Misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ValidTransactions {


    public List<String> invalidTransactions(String[] transactions) {
        HashMap<String, String[]> map = new HashMap<>();

        List<String> ans = new ArrayList<>();
        for(int i =0;i<transactions.length;i++){
            String[] sp = transactions[i].split(",");
            String[] S = new String[5];
            S[0]=sp[0];
            S[1]=sp[1];
            S[2]=sp[2];
            S[3]=sp[3];
            S[4]="no";
            if(Integer.parseInt(S[2])>=1000){
                ans.add(transactions[i]);
                continue;
            }
            if(map.containsKey(S[0])){
                String[] str = map.get(S[0]);
                if(!str[3].equalsIgnoreCase(S[3]) && Integer.parseInt(S[1])-Integer.parseInt(str[1])<=60){
                    if(str[4]=="no") {
                        ans.add(str[0] + ',' + str[1] + ',' + str[2] + ',' + str[3]);
                    }
                    ans.add(transactions[i]);
                    S[4]="yes";
                    map.put(S[0],S);
                }

            }
            else{
                map.put(S[0],S);
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        ValidTransactions test = new ValidTransactions();
        String[] transactions = {"alice,20,800,mtv","bob,50,1200,mtv","alice,50,800,mtv1","alice,60,800,mtv2"};
        List<String> ans = test.invalidTransactions(transactions);
        for(String s : ans){
            System.out.println(s);
        }
    }
}
