package graph;

import recursion.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfProvinces_7 {

    public static void main(String[] args) {

        int arr[][]={{1,1,0},{1,1,0},{0,0,1}};
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        list.add(new ArrayList<>(Arrays.asList(1,1,0)));
        list.add(new ArrayList<>(Arrays.asList(1,1,0)));
        list.add(new ArrayList<>(Arrays.asList(0,0,1)));
       int count= numberOfProvinces(list,3);
       System.out.println(count);

    }

    static int numberOfProvinces(ArrayList<ArrayList<Integer>> adj,int v)
    {
        int count=0;

        ArrayList<ArrayList<Integer>> adjlst=new ArrayList<>();

        for(int i=0;i<v;i++)
        {
            adjlst.add(new ArrayList<Integer>());
        }
        //to change adjacency matrix to list
        for(int i=0;i<v;i++)
        {
            for(int j=0;j<v;j++)
            {
                if(adj.get(i).get(j)==1 && i!=j)
                {
                    adjlst.get(i).add(j);
                    adjlst.get(j).add(i);
                }
            }
        }
        int vis[]=new int[v];

        for(int i=0;i<v;i++)
        {
            if(vis[i]==0)
            {
                count++;
                dfs(i,adjlst,vis);
            }
        }
        return count;
    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjlst, int[] vis) {
        vis[node]=1;

        for(Integer it:adjlst.get(node))
        {
            if(vis[it]==0)
            {
                dfs(it,adjlst,vis);
            }
        }

    }
}
