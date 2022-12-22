package codility;

public class HeadTail {

    public static void main(String[] args) {

        int arr[]={1,0,1,0,1,1};
        String binary=Integer.toString(10,2);
        System.out.println(binary);
         //System.out.println(Integer.toString(10,2));
       // System.out.println(ans(arr));
    }
    public static int ans(int[] arr)
    {
        int temp=arr[0];
        int count=0;
        for(int i=1;i<arr.length;i++)
        {
            if(temp==arr[i])
            {
                count++;
            }
            else
            {
                temp=arr[i];
            }
        }

        return count;
    }
}
