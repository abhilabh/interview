package Graph;

public class TestClass {
    public static void main(String args[]){
        GraphImpl graph = new GraphImpl(5);
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
        graph.addNodeAdj(0, 1);
        graph.addNodeAdj(0, 2);
        graph.addNodeAdj(1, 2);
        graph.addNodeAdj(2, 0);
        graph.addNodeAdj(2, 3);
        graph.addNodeAdj(3, 3);

        //graph.bfsPrint(2);
        graph.dfsPrint(2);
    }
}
