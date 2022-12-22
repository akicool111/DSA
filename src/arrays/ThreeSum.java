package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        //-4,-1,-1,0,1,2
        //Sum of thee numbers must be zero
       System.out.println(threeSum(arr));

    }

    static List<List<Integer>> threeSum(int[] arr)
    {
          Arrays.sort(arr);
         List<List<Integer>> list=new ArrayList<>();
         int start;
         int left;
         int right;
         for(int i=0;i< arr.length;i++)
         {
             start=i;
             left=start+1;
             right= arr.length-1;
             if(start>0 && arr[start]==arr[start-1])
             {
                 continue;
             }
             while(left<right)
             {

                  if(arr[start]+arr[left]+arr[right]==0)
                 {
                     List<Integer> ilist=new ArrayList<>();

                     ilist.add(arr[start]);
                     ilist.add(arr[left]);
                     ilist.add(arr[right]);
                     list.add(ilist);
                     left=left+1;

                      while(arr[left]==arr[left-1] && left<right)
                      {
                          left=left+1;
                      }

                     continue;

                 } else if (arr[start]+arr[left]+arr[right]>0) {
                     right=right-1;
                 }
                 else
                 {
                     left=left+1;
                 }
             }

         }
         return list;
    }
}
