package String.Questions;

public class MaxPalindromeSub {
    public int max(int i, int j){
        return i>j?i:j;
    }
    public int palindrome(String str,int i,int j){
        System.out.println(i+" "+j);
        if(i==j) return 1;
        else if(j==i+1 && str.charAt(i+1)==str.charAt(j)) return 2;
        else if(str.charAt(i)!=str.charAt(j)) return max(palindrome(str,i,j-1),palindrome(str,i+1,j));
        else return 2+palindrome(str,i+1,j-1);
    }
    public static void main(String[] args) {
        MaxPalindromeSub x = new MaxPalindromeSub();
        String str = "abaab";
        System.out.println(x.palindrome(str,0,str.length()-1));
    }
}
