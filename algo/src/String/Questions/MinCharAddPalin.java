package String.Questions;

public class MinCharAddPalin {
    public boolean lps(String S){
        int arr[] = new int[S.length()];
        int len = 0;
        int i=1;
        int max=0;
        while(i < S.length()){
            if(S.charAt(len)==S.charAt(i)){
                len++;
                arr[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len = arr[len-1];
                }
                else{
                    arr[i]=len;
                    i++;
                }
            }
            max= max<len?len:max;
        }
        int mid = S.length()/2;
        if(mid==max) return true;

        return false;
    }
    public String reverse(String S,int j){
        String ret = "";
        for(int i=S.length()-1;i>=j;i--){
            ret+= S.charAt(i);
        }
        System.out.println(ret);
        return ret;
    }
    public String genrate(String S){
        System.out.println(S);
        int mid = (S.length()-1)/2;
        String ret="";
        for(int i =0;i<=mid;i++){
            ret+=S.charAt(i);
        }
        for(int i=S.length()-1;i>mid;i--){
            ret+=S.charAt(i);
        }
        System.out.println(ret);
        return ret;
    }
    public int solve(String A) {

        String S = reverse(A,0);

        int i=0;
        if(lps(genrate(S))) return 0;
        while(i<A.length()-1){
            for(int j=i;j>=0;j--)
                S+= A.charAt(j);
            if(lps(genrate(S))) break;
            i++;
        }
        return i+1;
    }

    public static void main(String[] args) {
        MinCharAddPalin x = new MinCharAddPalin();
        System.out.println(x.solve("babb"));
    }
}

