package sorting;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr={3,2,4,5,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void  sort(int[] arr)
    {
        int i=0;

        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    public static void swap(int[] arr,int first,int second)
    {
        int tmp=arr[first];
        arr[first]=arr[second];
        arr[second]=tmp;
    }
}
