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

    public void dfsPrint(Integer start){
        boolean visited[] = new boolean[nV];
        LinkedList<Integer> stack = new LinkedList<>();
        stack.add(start);
        visited[start] = true;
        System.out.print(start);
        Integer next = start;

        while (stack.size() != 0){

                Iterator<Integer> i = graphNode[next].listIterator();
                while(i.hasNext()) {
                    Integer t = i.next();
                    if(visited[t]!=true){
                        System.out.print(" "+t);
                        stack.add(t);
                        next = t;
                        visited[next]=true;
                        break;
                    }
                    if(!i.hasNext()) {
                        stack.pollLast();
                        if(stack.size()!=0)
                        next = stack.getLast();

                    }

                }


            }

    }
    public void dfsUtils(Integer i, boolean v[]){
        v[i] = true;
        System.out.print(i+" ");

        Iterator<Integer> n = graphNode[i].listIterator();
        while(n.hasNext()){
            Integer j = n.next();
            if(v[j] != true){
                dfsUtils(j,v);
            }
        }
    }
    public void dfsRecurs(Integer i){
        boolean v[] = new boolean[nV];
        dfsUtils(i,v);
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
