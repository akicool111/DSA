package arrays;

import java.util.Arrays;

public class TwoSumTwo {
    public static void main(String[] args) {
        int [] arr={1,3,4,5,7,10,11};
        int target=21;

        System.out.println(Arrays.toString(twoSumTwo(arr,target)));


    }

    static int[] twoSumTwo(int[] arr,int target)
    {
         int start=0;
         int end=arr.length-1;

         while(start<end)
         {
             if(arr[start]+arr[end]==target)
             {
                 return new int[]{start+1,end+1};
             }
             if(arr[start]+arr[end]>target)
             {
                 end=end-1;
             }
             else
             {
                 start =start+1;
             }
         }


         return new int[]{-1,-1};
    }
}
