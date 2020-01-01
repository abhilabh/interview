package String.Questions;

public class NextPalindrom {
    public String genrate(String S, int index){
        String ret="";
        for (int i=0;i<S.length();i++){
            if(i==index){
                ret+=Character.getNumericValue(S.charAt(i)) + 1;
            }
            else if(i>index){
                ret += S.charAt(S.length()-i-1);
            }
            else ret+=S.charAt(i);
        }
        return ret;
    }
    public String palindrom(String S){
        int size = S.length();
        String ret = "";
        int mid = size/2;
        int i = 0;
        int sum =0;
        if(size % 2 !=0){

            ret+=S.charAt(mid);

            for(i =0;i<mid;i++){
                int x = Character.getNumericValue(S.charAt(i));
                sum+=x;
                if(S.charAt(mid+1)==S.charAt(mid-1)){
                    continue;
                }
                if(Character.getNumericValue(S.charAt(mid+1))> Character.getNumericValue(S.charAt(mid-1))){
                    break;
                }
            }
        }
        return genrate(S, mid+i);
    }
    public static void main(String[] args) {
        NextPalindrom x = new NextPalindrom();
        System.out.println(x.palindrom("12345"));
    }
}
