package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {

       HashMap<Integer,Boolean> map=new HashMap<Integer, Boolean>();
      if(!map.containsKey(1))
       System.out.println("ok");



    }
    public static ArrayList<Integer> bfs(int v,ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> bfs=new ArrayList<>();

        boolean[] vis=new boolean[v+1];
       // HashMap<Integer,Boolean> map=new HashMap<Integer, Boolean>();


        for(int i=1;i<=v;i++)
        {
            if(vis[i]==false)
            {
                vis[i]=true;
                Queue<Integer> q=new LinkedList<>();
                q.offer(i);

                while(!q.isEmpty())
                {
                    Integer node=q.poll();
                    bfs.add(node);
                    for(Integer it : adj.get(node))
                    {
                        if(vis[it]==false)
                        {
                            vis[it]=true;
                            q.offer(it);
                        }
                    }

                }

            }
        }

        return bfs;
    }
}
