package String.Questions;

public class IsPalindrom {
    public boolean isAlphaNumeric(char c){
        if((c>=48 && c<=57) || (c>=65 && c<=90)||(c>=97 && c<=122))
            return true;
        return false;
    }
    public int isPalindrome(String A) {
        int i =0;
        int j = A.length() -1;
        while(i<=j){
            char c = Character.toLowerCase(A.charAt(i));
            char h = Character.toLowerCase(A.charAt(j));
            if(!isAlphaNumeric(c)){
                i++;
                continue;
            }
            if(!isAlphaNumeric(h)){
                j--;
                continue;
            }
            if(c==h){
                i++;j--;
            }
            else return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        IsPalindrom x = new IsPalindrom();
        System.out.println(x.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
