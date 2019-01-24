/**
 * Created by abhilabh on 1/23/19.
 */



public class SolForSum extends AbstractHash  {

    int[] hash ;

    public SolForSum(int size){
        hash= new int[size];
        for(int i=0; i<hash.length;i++){
            hash[i]=-1;
        }
    }
    @Override
    public int getHash(int value) {
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
    public boolean searchValue(int value){
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

    public void insertIntoHash(int[] Arr){


        for(int i=0;i<Arr.length;i++){
            hash[getHash(Arr[i])]=Arr[i];
        }
    }

    public void printHashTable(){
        for(int i=0;i<hash.length;i++){
            System.out.println("\t"+hash[i]);
        }
    }

    public  static boolean  isSolPossible(int[] Arr,int size, int sum){
        //int hash[] = new int[Arr.length];
        SolForSum test = new SolForSum(Arr.length);
        test.insertIntoHash(Arr);

        test.printHashTable();

        for(int i=0;i<size;i++){
            int restVal= sum - test.hash[i];
            if(restVal<0) continue;
            if(test.searchValue(restVal)) return true;
        }


        return false;
    }

    public static void main(String args[])
    {
        int A[] = {1, 4, 45, 6, 10, 8};
        int n = 13;
        int arr_size = A.length;

        // Function calling
        if(isSolPossible(A, arr_size, n))
            System.out.println("Array has two " +
                    "elements with given sum");
        else
            System.out.println("Array doesn't have " +
                    "two elements with given sum");

    }
}
