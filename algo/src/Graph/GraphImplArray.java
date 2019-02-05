package Graph;

import java.util.LinkedList;

public class GraphImplArray {

    Integer graphNode[][];
    Integer nV;

    GraphImplArray(Integer nV){
        this.nV = nV;
        graphNode = new Integer[nV][nV];

        for (int i=0; i<nV;i++)
            for (int j=0;j<nV;j++){
                graphNode[i][j] = 0;
            }
    }

    public void addNode(Integer i, Integer j){
        graphNode[i][j] = 1;
    }

    public void printGraph(){
        for (int i = 0; i<nV; i++) {
            System.out.print(i);
            for (int j = 0; j < nV; j++) {

                if (graphNode[i][j] == 1)
                    System.out.print("-->" + j);
            }
            System.out.println();
        }
    }
    public void bfsPrint(Integer i){
        boolean v[] = new boolean[nV];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(i);
        v[i] = true;

        while(queue.size() != 0){
            i = queue.poll();
            System.out.print(i+" ");
            for (int j=0;j < nV;j++){
                if(graphNode[i][j]==1 && v[j]!=true){
                    queue.add(j);
                    v[j] = true;
                }
            }
        }
    }
}
