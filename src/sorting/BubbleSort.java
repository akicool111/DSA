package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr={5,4,3,2,1};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr)
    {
        boolean swapped;
      for(int i=0;i<arr.length;i++)
      {
          swapped=false;
          for(int j=1;j<arr.length-i;j++)
          {
              if(arr[j]<arr[j-1])
              {
                  swapped=true;
                  swap(arr,j,j-1);
              }

          }
          if(!swapped)
          {
              break;
          }
      }
    }
    public static void swap(int[] arr,int i,int j)
    {
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

}
