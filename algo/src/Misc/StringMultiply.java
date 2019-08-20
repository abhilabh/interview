package Misc;

public class StringMultiply {
    public String trim(String S){
        int i =0;
        String res="";
        while (i<S.length() && S.charAt(i)=='0') i++;
        while (i<S.length()) {res+=S.charAt(i); i++;}
        return res;
    }

    public  String reverse(String S){
        String ret = "";
        for(int i=S.length()-1;i>=0;i--){
            ret+=S.charAt(i);
        }
        return ret;
    }
    public String addNum(String S1, String S2){
        String S3="";

        int carry = 0;
        S1 = reverse(S1);
        S2 = reverse(S2);
        int i=0; int j=0;
        while (i< S1.length() && j< S2.length()){
            int sum = 0;
            sum = carry + Character.getNumericValue(S1.charAt(i)) + Character.getNumericValue(S2.charAt(i));
            carry = sum / 10;
            S3+=String.valueOf(sum%10);
            i++;j++;
        }
        while (i< S1.length()){
            int sum = carry + Character.getNumericValue(S1.charAt(i));
            carry = sum / 10;
            S3+=String.valueOf(sum%10);
            i++;
        }
        while (j< S2.length()){
            int sum = carry + Character.getNumericValue(S2.charAt(j));
            carry = sum / 10;
            S3+=String.valueOf(sum%10);
            j++;
        }
        if(carry!=0) S3+=String.valueOf(carry);
        return reverse(S3);

    }
    public String multiply(String S1, String S2){

        String S4 = "";

        String nS1 = reverse(S1);
        String nS2 = reverse(S2);
        int i =0;
        int j =0;
        int carry =0;
        while (i<nS1.length()){
            carry=0;
            String S3 ="";
            int k =0;
            while (k<i) {
                S3 += '0';
                k++;
            }
            j=0;
            while (j< nS2.length()){
                int mul =  carry + Character.getNumericValue(nS1.charAt(i)) * Character.getNumericValue(nS2.charAt(j));
                carry = mul /10;
                S3+=String.valueOf(mul%10);
                j++;
            }
            if(carry!=0) S3+=String.valueOf(carry);
            if(S3.length()==1 && S3.charAt(0)=='0' ) return "0";
            //System.out.println(S3);
            S4 = addNum(S4,reverse(S3));
            //System.out.println(S4);
            i++;

        }
        return S4;
    }

    public static void main(String[] args) {
        StringMultiply x = new StringMultiply();
        String S = "1234";
        System.out.println(x.multiply("56675688419586288442134264892419611145485574406534291250836","5131848155574784703269632922904933776792735241197982102373370"));
        //System.out.println(x.addNum("9768","00888"));
        //System.out.println(x.trim("0001234"));
    }
}
