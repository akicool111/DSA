package binarytree;

import java.util.Comparator;
import java.util.PriorityQueue;

public class heap {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxheap =new PriorityQueue<>();
        int arr[]={7,10,4,3,20,15,12,35};

          maxheap.add(3);
          maxheap.add(6);
       // System.out.println(maxheap);
          maxheap.add(4);
          //maxheap.add(8);

       //  System.out.println(maxheap);
         maxheap.remove();
      //  System.out.println(maxheap);
      //  System.out.println(kthSmallestElement(arr,3));

        System.out.println(kthLargestElement(arr,3));


       // System.out.println(minheap.size());
        //20,10,5,2
       // System.out.println(maxheap.peek());
       // System.out.println(maxheap.size());
       // System.out.println(minheap.remove());
//
//        System.out.println(minheap.peek());
//        System.out.println(minheap.size());

    }

    public static int kthLargestElement(int[] arr,int k)
    {
        PriorityQueue<Integer> maxheap=new PriorityQueue<>();

        for(int i=0;i<arr.length;i++)
        {
            maxheap.offer(arr[i]);
            System.out.println(maxheap);
            if(maxheap.size()>k)
            {
                maxheap.poll();
                System.out.println("After removal "+maxheap);
            }
        }

        return maxheap.peek();
    }
    public static int kthSmallestElement(int[] arr,int k)
    {
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Comparator.reverseOrder());

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
}
