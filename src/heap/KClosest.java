package heap;

import java.util.PriorityQueue;

public class KClosest {

    public static void main(String[] args) {

    }
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> maxheap=new PriorityQueue<>((a,b)->
                Integer.compare(
                        (b[0]*b[0]+b[1]*b[1]),(a[0]*a[0]+a[1]*a[1])));

        for(int[] i:points)
        {
            maxheap.add(i);

            if(maxheap.size()>k)
            {
                maxheap.poll();
            }
        }

        int[][] ans=new int[k][2];
        for(int i=0;i<k;i++)
        {
            int curr[] =maxheap.poll();
            ans[i][0]=curr[0];
            ans[i][1]=curr[1];

        }

        return ans;
    }
}
