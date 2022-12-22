package slidingwindow;

public class MaximumSumSumArray {
    public static void main(String[] args) {
        int[] arr ={2,5,1,8,2,9,1};

        int k=3;
        System.out.println(maxSumSubarray(arr,k));
    }

    public static int maxSumSubarray1(int[] arr,int k)
    {
        int i=0;
        int j=0;
        int sum=0;
        int max=0;

        while(j<arr.length)
        {
            sum=sum+arr[j];

            if(j-i+1<k)
            {
                j++;
            }
            else
            {
               max=Math.max(sum,max);
               sum=sum-arr[i];
               i++;
               j++;
            }
        }

        return max;

    }
    public static int maxSumSubarray(int[] arr,int k)
    {
        int i=0;
        int j=0;
        int sum=0;
        int max=0;
        while(j<arr.length)
        {
            sum=sum+arr[j];
            if(j-i+1<k)
            {
                j++;
            }
            else
            {
                max=Math.max(sum,max);
                sum=sum-arr[i];
                j++;
                i++;
            }
        }
        return max;
    }
}
