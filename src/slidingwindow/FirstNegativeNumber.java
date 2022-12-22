package slidingwindow;

import recursion.Array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeNumber {

    public static void main(String[] args) {

        int arr[]=new int[]{1,-1,3,-4,5};
       ArrayList<Integer> list= firstNewgativeNumber(arr,3);

       System.out.println(list);
    }

    public static ArrayList<Integer> firstNewgativeNumber(int[] arr,int k)
    {
       int i=0;
       int j=0;
       ArrayList<Integer> list=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
       while(j<arr.length)
       {
           if(arr[j]<0)
           {
               q.offer(arr[j]);
           }

           if(j-i+1<k)
           {
               j++;
           }
           else
           {
               if(q.isEmpty())
               {
                   list.add(0);
               }
               else
               {
                   int ans=q.peek();
                   list.add(ans);
                   if(arr[i]<0)
                   {
                       q.poll();
                   }

               }

               i++;
               j++;
           }
       }
           return list;
    }
}
