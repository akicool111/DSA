package slidingwindow;

public class LargestSubarray {

    public static void main(String[] args) {
        int[] arr=new int[]{4,1,1,1,2,3,5};

        int ans=largestSubArray(arr,5);

        System.out.println(ans);
    }
    public static int largestSubArray(int[] arr,int k)
    {
        int max=0;
        int sum=0;
        int i=0;
        int j=0;

        while(j<arr.length)
        {
            sum=sum+arr[j];
            if(sum<k)
            {
                j++;
            }
            else if(sum==k)
            {
                max=Math.max(max,j-i+1);
                j++;
            }
            else
            {
                sum=sum-arr[i];
                i++;
                j++;
            }
        }


        return max;
    }
}
