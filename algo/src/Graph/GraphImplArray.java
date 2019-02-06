package Graph;

import org.jetbrains.annotations.NotNull;

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
    public void printMst(Integer parent[], Integer graph[][], int size){
        System.out.println("Edge \tweight");
        for (int i = 1; i < size; i++){
            System.out.println(parent[i]+" - "+ i+"\t"+
                    graph[i][parent[i]]);
        }
    }

    public Integer minIndex(Integer key[], boolean visited[], Integer size){
        Integer minVal = Integer.MAX_VALUE;
        Integer minIndex = -1;

        for(int v = 0; v < size; v++){
            if(visited[v] == false && key[v] < minVal){
                minIndex = v;
                minVal = key[v];
            }
        }
        return minIndex;
    }

    public void prismMst(Integer graph[][], Integer size) {

        boolean mstSet[] = new boolean[size];
        Integer key[] = new Integer[size];
        Integer parent[] = new Integer[size];

        for (int i = 0; i < size; i++) {
            key[i] = Integer.MAX_VALUE;
            parent[i] = -1;
        }

        key[0] = 0;
        parent[0] = -1;

        for(int count = 0; count < size - 1; count++){
            int min = minIndex(key, mstSet, size);
            mstSet[min] = true;

            for(int i = 0; i < size; i++){
                int adj = graph[min][i];
                if(adj > 0 && mstSet[i] == false && adj < key[i]){
                    key[i] = adj;
                    parent[i] = min;
                }
            }
        }
        printMst(parent, graph, size);
    }

    private void printDistance(Integer dist[], Integer size)
    {
        System.out.println("Vertex   Distance from Source\n");
        for (int i = 0; i < size; i++){
            System.out.println(i+"\t\t"+dist[i]);
        }

    }

    public void djkstraMst(Integer graph[][], Integer size){
        boolean mstSet[] = new  boolean[size];
        Integer key[] = new Integer[size];
        Integer parent[] = new Integer[size];

        for(int i =0; i < size; i++){
            key[i] = Integer.MAX_VALUE;
            parent[i] = -1;
        }

        key[0] = 0;
        for(int count = 0; count < size - 1; count++){
            int u = minIndex(key, mstSet, size);
            mstSet[u] = true;

            for(int v = 0; v < size; v++){
                Integer adjWeight = graph[u][v];
                if(adjWeight != 0 && mstSet[v] == false && adjWeight + key[u] < key[v]){
                    key[v] = adjWeight + key[u];
                    parent[v] = u;
                }
            }
        }

        printDistance(key, size);
    }

    private Integer max(Integer i, Integer j){
        if(i > j) return i;
        return j;
    }

    private Integer longDistDfs(Integer graph[][], Integer dist[], @NotNull boolean visited[], Integer u, Integer size, Integer x){

        visited[u] = true;

        for(int v = 1; v < size; v++){
            Integer adj = graph[u][v];
            if (adj != 0 && visited[v] == false){
                if(dist[v] == Integer.MIN_VALUE) dist[v] = dist[u] + adj;
                else
                dist[v] = max(dist[v],dist[u]+adj);
                x = adj + longDistDfs(graph,dist,visited,v,size, x);

                if(x > dist[u]){
                    dist[u] = max(x, dist[u]);
                    x=0;
                }

            }
        }
        return x;
    }

    public int longestDist(Integer graph[][], Integer size){
        boolean visited[] = new boolean[size];
        Integer dist[] = new Integer[size];
        for (int i = 0; i < size; i++){
            dist[i] = Integer.MIN_VALUE;
        }
        dist[1] =0;
        for (int i =1; i < size; i++){
            if (visited[i] == false){
                longDistDfs(graph, dist, visited, i, size, 0);
            }
        }
        for(int i = 0; i < size; i++){
            System.out.print(dist[i]+ " ");
        }
        return  0;
    }
    /*
    Count all possible paths between two vertices
Count the total number of ways or paths that exist between two vertices in a directed graph. These paths doesn’t contain a cycle, the simple enough reason is that a cylce contain infinite number of paths and hence they create problem.

Examples:

Input : Count paths between A and E


Output : Total paths between A and E are 4
         Explanation: The 4 paths between A and E are:
                      A -> E
                      A -> B -> E
                      A -> C -> E
                      A -> B -> D -> C -> E
     */

    private Integer dfsNoOfPath(Integer u, Integer v, Integer count){


        for(int i = 0; i < nV; i++){
            if( graphNode[u][i] != 0){
                if(i == v){
                    count++;
                    continue;
                }
                count = dfsNoOfPath( i, v, count);
            }
        }
        return count;
    }

    public Integer NoOfPath(Integer u, Integer v){
        int count =0;
        count = dfsNoOfPath(u, v, count);
        return count;

    }

}

