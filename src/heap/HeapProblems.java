package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapProblems {

    public static void main(String[] args) {
        int[] arr={5,2,3,1,4,7,6};

        //System.out.println(Kthlargest(arr,2));
        System.out.println(Kthsmallest(arr,5));
    }

    private static int Kthsmallest(int[] arr,int k)
    {
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<arr.length;i++)
        {
            maxheap.offer(arr[i]);

            if(maxheap.size()>k)
            {
                maxheap.poll();
            }

        }
        return maxheap.peek();
    }
    private static int Kthlargest(int[] arr,int k)
    {
        PriorityQueue<Integer> minheap=new PriorityQueue<>();

        for(int i=0;i<arr.length;i++)
        {
            minheap.offer(arr[i]);

            if(minheap.size()>k)
            {
                minheap.remove();
            }

        }
        return minheap.peek();
    }
}
