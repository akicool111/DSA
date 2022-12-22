package graph;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands_8 {
    static class Pair{
        int first;
        int second;

       public  Pair(int first,int second)
        {
            this.first=first;
            this.second=second;
        }
    }
    public static void main(String[] args) {

        int grid[][]={};
    }

    public static void bfs(int ro,int co,int[][] grid,int[][] vis)
    {
        vis[ro][co]=1;
        Queue<Pair> queue=new LinkedList<>();
        queue.offer(new Pair(ro,co));

        int n=grid.length;
        int m=grid[0].length;
        while(!queue.isEmpty())
        {
            int row=queue.peek().first;
            int col=queue.peek().second;
            queue.poll();

            for(int delrow=-1;delrow<=1;delrow++)
            {
                for(int delcol=-1;delcol<=1;delcol++)
                {
                    int nrow=row+delrow;
                    int ncol=col+delcol;
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&
                    vis[nrow][ncol]==0 && grid[nrow][ncol]==1)
                    {
                        vis[nrow][ncol]=1;
                        queue.add(new Pair(nrow,ncol));
                    }

                }
            }
        }

    }

    public static int numberOfIslands(int[][] grid)
    {
        int count=0;
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];

        for(int row=0;row<n;row++)
        {
            for(int col=0;col<m;col++)
            {
                 if(vis[row][col]==0 && grid[row][col]==1)
                 {
                     count++;
                     bfs(row,col,grid,vis);
                 }
            }
        }
        return count;

    }

}
