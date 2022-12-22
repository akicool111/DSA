package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DFS {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(0, 1)));
        list.add(new ArrayList<>(Arrays.asList(1, 2)));
        list.add(new ArrayList<>(Arrays.asList(1, 3)));
        list.add(new ArrayList<>(Arrays.asList(2, 3)));
        list.add(new ArrayList<>(Arrays.asList(3, 0)));
        ArrayList<Integer> dfs= dfsOfGraph(4,list);

        System.out.println(dfs);
    }

    public static void dfs(Integer node,boolean[] vis,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> list)
    {
        vis[node]=true;
        list.add(node);

        for(Integer i:adj.get(node))
        {
            if(vis[i]==false)
            {
                dfs(i,vis,adj,list);
            }
        }
    }
    public static ArrayList<Integer> dfsOfGraph(int v,ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> list=new ArrayList<>();

        boolean vis[]=new boolean[v];
        vis[0]=true;

        dfs(0,vis,adj,list);

        return list;

    }


}
