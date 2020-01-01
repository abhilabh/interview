package Misc;

import java.util.Stack;

public class Test1 {
    public int solution(int[] A){
        int count = 0;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(A[0]);
        int i =1;
        while(i<A.length){
            if(!stack.empty() && stack.peek() == A[i]) stack.push(A[i++]);
            else if(!stack.empty() && stack.peek() < A[i]){
                if(stack.size() ==1){
                    stack.pop();
                    stack.push(A[i]);
                    i++;
                    continue;
                }
                if(stack.size()> 1){
                    stack.clear();
                    stack.push(A[i]);
                    i++;
                    count++;
                    continue;

                }
            }
            else{


            }
        }

        return count;
    }
    public int countCastles(int[] A){
        boolean castle = true;

        int count =0;
        for(int i=1; i<A.length ;i++){
            if(A[i]>A[i-1]){
                if(castle) {
                    count++;
                    castle = false;
                }
            }
            else if(A[i]==A[i-1]){
                continue;
            }
            else{
                castle = true;
            }
        }
        if(castle) count++;
        return count;
    }
    public int counthills(int[] A){
        boolean hill = true;

        int count =0;
        for(int i=1; i<A.length ;i++){
            if(A[i]<A[i-1]){
                if(hill) {
                    count++;
                    hill = false;
                }
            }
            else if(A[i]==A[i-1]){
                continue;
            }
            else{
                hill = true;
            }
        }
        if(hill) count++;
        return count;
    }
    public int solution1(int[] A){
        int allCount =0;
        int hCount =0;
        int cCount =0;
        int sum =0;
        int i =1;
        while (i< A.length && A[i]==A[i-1])
        if(i==A.length) return 1;
        hCount = counthills(A);
        cCount = countCastles(A);
        allCount = cCount+hCount;
        return allCount;

    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        int a[] = {2,2,3,4,3,3,2,2,1,1,2,5};
        System.out.println(t.solution1(a));
    }
}
