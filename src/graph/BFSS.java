package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFSS {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(0, 1)));
        list.add(new ArrayList<>(Arrays.asList(1, 2)));
        list.add(new ArrayList<>(Arrays.asList(2, 3)));
        list.add(new ArrayList<>(Arrays.asList(3, 0)));
       ArrayList<Integer> bfs= bfsOfGraph(4,list);

       System.out.println(bfs);



    }
    public static ArrayList<Integer> bfsOfGraph(int v,ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> bfs=new ArrayList<>();
        Queue<Integer> queue=new LinkedList<>();
        boolean vis[]=new boolean[v];
        queue.offer(0);
        vis[0]=true;

        while(!queue.isEmpty())
        {
            Integer node=queue.poll();
            bfs.add(node);

            for(Integer i:adj.get(node))
            {
                System.out.println(i);
                if(vis[i]==false)
                {
                    vis[i]=true;
                    queue.add(i);
                }
            }

        }

        return bfs;
    }
}
