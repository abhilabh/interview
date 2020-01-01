package String;

public class KmpAlgo {
    public int[] lps(String t){
        int arr[] = new int[t.length()];
        int i=1;
        int len = 0; //length of common suffix
        arr[i]=0;

        while (i < t.length()) {
            if (t.charAt(i) == t.charAt(len)) {
                /*
                if equal increase the length and store the length to array
                 */
                len++;
                arr[i] = len;
                i++;
            } else {
                /*
                if not equal and length not 0 update len
                else update array and increase index
                 */
                if (len != 0) {
                    len = arr[len - 1];

                } else {
                    arr[i] = len;
                    i++;
                }
            }
        }

        return arr;
    }
    public int search(String S, String T){
        int arr[]= lps(T);
        int i =0;
        int j =0;
        while(i<S.length() && j<T.length()){
            if(S.charAt(i)==T.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j!=0)
                j=arr[j-1];
                if(S.charAt(i)!=T.charAt(j)){
                    i++;
                    j=arr[j];

                }
            }

        }
        if(j==T.length()){
            return i-T.length();
        }
        return -1;
    }
    public static void main(String[] args) {
        KmpAlgo test= new KmpAlgo();
        //String S1="abcxabcdabxabcdabcdabcy";
        //String t = "abcdabcy";
        String S1="ABABDABACDABABCABAB";
        String t = "ABABAABAB";
        int value = test.search(S1,t);//aabaaaba
        System.out.println(value);

    }
}
