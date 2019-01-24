/**
 * Created by abhilabh on 1/24/19.
 */
public class Hashing implements Hash {
    private static Hashing ourInstance = new Hashing();

    public static Hashing getInstance() {
        return ourInstance;
    }

    private Hashing() {
    }

    @Override
    public int getHash(int value,int[] hash) {
        int size = hash.length;
        int key = value%size;
        if(hash[(key)]==-1){
            return key;
        }
        else {
            for(int i=0;i<size;i++){
                if(hash[((key++)%size)]!=-1){
                    return key;
                }
            }

        }
        return  key;
    }

    @Override
    public boolean searchValue(int value,int[] hash){
        int size = hash.length;
        int key = value%size;
        if(hash[key]==value){
            return true;
        }
        else{
            while((key)%size!=0){
                if(hash[key]==value) return true;
                key++;
            }
        }
        return false;
    }
}
