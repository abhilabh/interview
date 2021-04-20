import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by abhilabh on 1/23/19.
 */



public class SolForSum  {

    public int[] hash ;
    private static SolForSum solForSum = new SolForSum();

    public static SolForSum getInstance(){return solForSum;}

    private SolForSum(){};

    public void initilizeHash(int size){
        hash= new int[size];
        for(int i=0; i<hash.length;i++){
            hash[i]=-1;
        }
    }

    public void insertIntoHash(int[] Arr){


        for(int i=0;i<Arr.length;i++){
            hash[Hashing.getInstance().getHash(Arr[i],SolForSum.getInstance().hash)]=Arr[i];
        }
    }

    public void printHashTable(){
        for(int i=0;i<hash.length;i++){
            System.out.println("\t"+hash[i]);
        }
    }

    public  static boolean  isSolPossible(int[] Arr,int size, int sum){
        Hashing hashVar =Hashing.getInstance();
        SolForSum.getInstance().initilizeHash(size);
        SolForSum.getInstance().insertIntoHash(Arr);

        SolForSum.getInstance().printHashTable();

        for(int i=0;i<size;i++){
            int restVal= sum - SolForSum.getInstance().hash[i];
            if(restVal<0) continue;
            if(Hashing.getInstance().searchValue(restVal,SolForSum.getInstance().hash)) return true;
        }


        return false;
    }

    public static void main(String args[])
    {
        int A[] = {1, 4, 45, 6, 10, 8};
        int n = 10;
        int arr_size = A.length;

        // Function calling
        if(isSolPossible(A, arr_size, n))
            System.out.println("Array has two " +
                    "elements with given sum");
        else
            System.out.println("Array doesn't have " +
                    "two elements with given sum");
//        HashMap<Integer,String> map = new HashMap<>();
//        Queue<HashMap> queue = new LinkedList<>();
//        map.put(1,"abhi");
//        queue.add(map);

    }
}
