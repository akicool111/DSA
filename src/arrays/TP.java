package arrays;

import java.util.*;

public class TP {
    public static void main(String[] args) {
//
//        int arr[][]={
//                {1,2,5,6,8},
//                {5,12,28,45,29},
//                {90,34,21}
//        };
//        int target=90;
       // int[] ans=findIn2D(arr,target);
     //   System.out.println(findIn2D(arr,target));
       // System.out.println(Arrays.toString(ans));

     String s="Aakash";

     char[] arr={'a','b'};

     System.out.println(Arrays.toString(arr));



        System.out.println(Arrays.toString(arr));


    }

    public  static boolean  findIn2D(int[][] arr,int target)
    {
        /*for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col] ==target)
                {
                    return new int[]{row,col};
                }
            }
        }*/

        for(int[] row :arr)
        {
            for(int col :row)
            {
                if(col==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
