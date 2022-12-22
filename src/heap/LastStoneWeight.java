package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {

    public static void main(String[] args) {
        int arr[]={};
    }

    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones)
        {
            maxheap.offer(i);
        }

        while(maxheap.size()>1)
        {
            int stone1=maxheap.poll();
            int stone2=maxheap.poll();
            if(stone1!=stone2)
            {
                maxheap.offer(stone1-stone2);
            }
        }

        return maxheap.size()!=0?maxheap.peek():0;
    }
}
