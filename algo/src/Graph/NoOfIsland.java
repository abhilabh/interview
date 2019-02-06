package Graph;

/*
Find the number of islands | Set 1 (Using DFS)
Given a boolean 2D matrix, find the number of islands. A group of connected 1s forms an island. For example, the below matrix contains 5 islands

Example:

Input : mat[][] = {{1, 1, 0, 0, 0},
                   {0, 1, 0, 0, 1},
                   {1, 0, 0, 1, 1},
                   {0, 0, 0, 0, 0},
                   {1, 0, 1, 0, 1}
Output : 5
 */

public class NoOfIsland {

    public static Integer ROW, COL;

    public boolean isSafe(Integer M[][], boolean visited[][], Integer c, Integer r){
        if(c >= 0 && r >=0 &&
                c < COL && r < ROW &&
                M[c][r] == 1 &&
                visited[c][r] == false) return true;
        return false;
    }

    private void dfsUtils(Integer graph[][], boolean visited[][], Integer u, Integer v){

        visited[u][v] = true;

        Integer c[] = new Integer[]{-1, -1, -1, 0, 1, 1, 1, 0};
        Integer r[] = new Integer[]{-1, 0, 1, 1, 1, 0, -1, -1};

        for (int i = 0; i < 8; i++){
            if(isSafe(graph, visited, u+c[i], v+r[i])){
                dfsUtils(graph, visited, u+c[i], v+r[i]);
            }
        }
    }

    public Integer NoOfIsland(Integer graph[][], Integer size){
        int count = 0;
        boolean visited[][] = new boolean[COL][ROW];
        for(int i = 0; i < COL; i++){
            for (int j = 0; j < ROW; j++)
            if(graph[i][j] == 1 && visited[i][j] == false){
                dfsUtils(graph, visited, i, j);
                count++;
            }
        }

        return count;
    }

    public static void main(String arg[]){
        NoOfIsland island = new NoOfIsland();
        NoOfIsland.ROW = 5;
        NoOfIsland.COL = 5;

        Integer graph[][] = new Integer[][]{{1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}};

        System.out.println(" No of island = "+ island.NoOfIsland(graph, 5));
    }
}
