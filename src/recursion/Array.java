package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int arr[]={2,4,7,9,9,9};

      //  System.out.println(sorted(arr,0));
        System.out.println(findall1(arr,9,0));
    }
    static ArrayList<Integer> findall(int[] arr, int target,int index, ArrayList<Integer> list)
    {
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        return findall(arr,target,index+1,list);

    }

    static ArrayList<Integer> findall1(int[] arr, int target,int index)
    {

        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        ArrayList<Integer> ans=findall1(arr,target,index+1);
        list.addAll(ans);
        return list;

    }
    static boolean find(int[] arr,int target,int index)
    {
        if(index==arr.length)
        {
            return false;
        }

        return arr[index]==target || find(arr,target,index+1);

    }

    static int findindex(int[] arr,int target,int index)
    {
        if(index==arr.length)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }
        else
        {
            return findindex(arr,target,index+1);
        }
    }
    static boolean sorted(int[] arr,int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}
