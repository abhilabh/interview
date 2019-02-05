package Graph;

public class TestClass {
    public static void main(String args[]){
        GraphImpl graph = new GraphImpl(6);
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
        graph.addNodeAdj(2, 3);
        graph.addNodeAdj(3, 1);
        graph.addNodeAdj(4, 0);
        graph.addNodeAdj(4, 1);
        graph.addNodeAdj(5, 0);
        graph.addNodeAdj(5, 2);

        graph.printGraph();
        graph.topologicalSort();

    }
}
