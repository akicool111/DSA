package arrays;

public class BinarySearch {

    public static void main(String[] args) {
//        int[] arr={10,23,45,67,89,100};
        int[] arr={2,5,7,10,13,15,17};
        int target=1;
//        System.out.println(ceiling(arr,target));

       // System.out.println(4%4);
        char[] chars={'c','f','g'};
        System.out.println(nextGreatestLetter(chars,'c'));
    }
     public static char nextGreatestLetter(char[] arr,char target)
     {
         int start=0;
         int end=arr.length-1;

         while(start<=end)
         {
             int mid=start+(end-start)/2;

             if(target < arr[mid])
             {
                 end=mid-1;
             }
             else
             {
                 start=mid+1;
             }
         }
       return arr[start % arr.length];
     }
    public static int floor(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]==target)
            {
                return arr[mid];
            }

            if(target<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
       if(end==-1)
       {
           return arr[arr.length-1];
       }
        return arr[end];
    }
    public static int ceiling(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]==target)
            {
                return arr[mid];
            }

            if(target<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        if(start== arr.length)
        {
            return arr[0];
        }
        return arr[start];
    }
    public static int bSearch(int[] arr,int target)
    {
        int start=0;
        int end= arr.length-1;

        boolean asec=false;

        if(arr[start]<arr[end])
        {
            asec=true;
        }

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(asec)
            {


                if(arr[mid]>target)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else
            {
                if(arr[mid]<target)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }

        }

      return -1;
    }
}
