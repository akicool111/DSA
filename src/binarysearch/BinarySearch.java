package binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        int target=10;
      //  System.out.println(binarySearch(arr,target));

        System.out.println(fibo(20));
    }
   static int fibo(int n)
   {
       int first=0;
       int second=1;
       int counter=3;
        int ans=1;
       //0  1  1 2 3 5 8 13
       while(counter<=n)
       {
           ans=first+second;
           first=second;
           second=ans;
           counter++;
       }



       return ans;
   }
    static int binarySearch(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;


        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid] == target)
            {
                return mid;
            }

            if(target>arr[mid])
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }

        }
        return -1;

    }
}
