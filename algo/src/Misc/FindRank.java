package Misc;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FindRank {

    // Complete the climbingLeaderboard function below.
    static int getRank(int[] scores,int rank[], int num){
        //int mid = scores.length/2;
        int start =0;
        int end = scores.length/2;
        while(start<end){
            int mid = scores.length/2;
            if(scores[mid]==num) return rank[mid];
            else if(num<scores[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            System.out.println(mid);
            System.out.println(end);

        }
        if(end==start){
            if(num>scores[start]) return rank[start];
        }
        //System.out.println(rank[scores.length-1]+1);
        return rank[start]+1;
    }
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] rank = new int[scores.length];
        int count =1;
        int[] aliceRank = new int[alice.length];
        rank[0]=1;
        for(int i =1;i<scores.length;i++){
            if(scores[i-1]==scores[i]) rank[i]=count;
            else rank[i]=++count;
            //System.out.println(rank[i]);
        }
        for(int j =0; j<alice.length ;j++){
            aliceRank[j] = getRank(scores,rank,alice[j]);
            //System.out.println(getRank(scores,rank,alice[j]));
        }
        //System.out.println(aliceRank[0]);
        //System.out.println(getRank(scores,rank,5));
        return aliceRank;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

