package Graph;

public class TestClass {
    public static void main(String args[]){
        GraphImpl graph = new GraphImpl(6);
        GraphImplArray graphArray = new GraphImplArray(5);
        /*graph.addNode(0,1);
        graph.addNode(0,4);
        graph.addNode(1,2);
        graph.addNode(1,3);
        graph.addNode(1,4);
        graph.addNode(2,3);
        graph.addNode(3,4);

        graph.printGraph(graph);
        */

        /*
        BFS test
         */

        /*
        graph.addNodeAdj(0, 1);
        graph.addNodeAdj(0, 2);
        graph.addNodeAdj(1, 2);
        graph.addNodeAdj(2, 0);
        graph.addNodeAdj(2, 3);
        graph.addNodeAdj(3, 3);


        //graph.bfsPrint(2);
        //graph.dfsPrint(2);
        graph.dfsRecurs(2);

        System.out.println("Mother vertex: "+ graph.motherVertex());
        */

        /*GraphImplArray graphArray = new GraphImplArray(5);
        graphArray.addNode(0,1);
        graphArray.addNode(0,2);
        graphArray.addNode(1,2);
        graphArray.addNode(2,0);
        graphArray.addNode(2,3);
        graphArray.addNode(3,3);
        //graphArray.printGraph();
        graphArray.bfsPrint(2);
        */
        /*
            Topological sort
         */
        /*
        graph.addNodeAdj(2, 3);
        graph.addNodeAdj(3, 1);
        graph.addNodeAdj(4, 0);
        graph.addNodeAdj(4, 1);
        graph.addNodeAdj(5, 0);
        graph.addNodeAdj(5, 2);

        graph.printGraph();
        graph.topologicalSort();
        */
        /*
        min spaning tree using prism
         */
        /*
        Integer graphPrism[][] = new Integer[][] {{0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0}};

        // Print the solution
        graphArray.prismMst(graphPrism,5);
        */
        /*
        dijkstra algo
         */
        /*
        Integer graphDjksatra[][] = new Integer[][] {{0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        graphArray.djkstraMst(graphDjksatra, 9);

        */

        /*
        longest path to be continued
         */
        /*
        Integer graphLongDist[][] = new Integer[][]{{0, 0, 0, 0, 0, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 3, 0, 4, 0, 0, 2},
                {0, 0, 4, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 6},
                {0, 0, 0, 0, 0, 0, 5},
                {0, 0, 0, 0, 6, 5, 0}

        };
        graphArray.longestDist(graphLongDist, 7);

        */
        graphArray.addNode(0, 1);
        graphArray.addNode(0, 2);
        graphArray.addNode(0, 4);
        graphArray.addNode(1, 3);
        graphArray.addNode(1, 4);
        graphArray.addNode(3, 2);
        graphArray.addNode(2, 4);

        System.out.println("no of count from "+0+" to "+ 4+" is "+graphArray.NoOfPath(0,4));
    }
}
