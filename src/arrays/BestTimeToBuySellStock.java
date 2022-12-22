package arrays;

public class BestTimeToBuySellStock {

    public static void main(String[] args) {
        int[] arr={2,1,2,1,0,1,2};
       System.out.println(maxProfit(arr));
    // 7     1
    //-6
    }
    public static int maxProfit(int[] arr)
    {
      int max=0;

      int left=0;
      int right=1;

      while(right < arr.length)
      {
          if(arr[right]>arr[left])
          {
              int profit=arr[right]-arr[left];
              max=Math.max(profit,max);
          }
          else
          {
              left=right;
          }
          right++;
      }

      return max;
    }
}
