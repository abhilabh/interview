package Graph;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;

public class GraphImpl {
    LinkedList<Integer> graphNode[];
    int nV;
    GraphImpl(int nV){
        this.nV =nV;
        graphNode = new LinkedList[nV];
        for (int i=0; i<nV;i++)
        {
            graphNode[i]=new LinkedList<>();
        }
    }

    public void addNode(Integer i, Integer j){
        graphNode[i].add(j);
        graphNode[j].add(i);
    }

    public void addNodeAdj(Integer i, Integer j){
        graphNode[i].add(j);
    }

    public void bfsPrint(Integer start){

        boolean visited[] = new boolean[nV];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (queue.size() != 0){
            start = queue.poll();

            System.out.print(" "+start);

            Iterator<Integer> i = graphNode[start].listIterator();

            while (i.hasNext()){
                int next = i.next();
                if (visited[next] != true){
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }

    public void printGraph(GraphImpl graph){
        for(int i=0; i< nV; i++){
            for (Integer k : graph.graphNode[i]){
                System.out.print(" "+k);
            }
            System.out.println();
        }
    }
}
