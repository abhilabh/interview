/*
A number is called as a Jumping Number if all adjacent digits in it differ by 1. The difference between ‘9’ and ‘0’ is not considered as 1.
All single digit numbers are considered as Jumping Numbers. For example 7, 8987 and 4343456 are Jumping numbers but 796 and 89098 are not.

Given a positive number x, print all Jumping Numbers smaller than or equal to x. The numbers can be printed in any order.
Input: x = 20
Output:  0 1 2 3 4 5 6 7 8 9 10 12
Input: x = 105
Output:  0 1 2 3 4 5 6 7 8 9 10 12
         21 23 32 34 43 45 54 56 65
         67 76 78 87 89 98 101
Solution-> We can create the jumping number if we add last digit - 1 and +1. We add number 1 - 9 in queue and dequeue number and add -1 and +1 to last
    digit and push it to queue.
 */

package Math;

import java.util.LinkedList;
import java.util.Queue;

public class JumpingNumbers {
    public void printJumpingNumbers(int n){
        Queue<String> queue = new LinkedList<>();
        for(int i = 1; i < 10; i++)
            queue.add(String.valueOf(i));
        System.out.print(0);
        String num = queue.remove();
        while(Integer.parseInt(num) < n){
            System.out.print(" "+ num);
            int lastDigit = Character.getNumericValue(num.charAt(num.length() - 1));
            if(lastDigit != 0)
                queue.add(num + String.valueOf(lastDigit -1));
            if(lastDigit != 9)
                queue.add(num + String.valueOf(lastDigit +1));
            num = queue.remove();
        }

    }
    public static void main(String[] args) {
        JumpingNumbers X = new JumpingNumbers();
        X.printJumpingNumbers(105);
    }
}
