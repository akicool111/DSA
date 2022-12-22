package codility;

import java.util.HashMap;

public class OddOccurances {
    public static void main(String[] args) {
    // int arr[]={1,0,1,0,3};
    // System.out.println(solution(arr));
        System.out.println(Math.ceil(75/30));
    }

    public static int solution(int[] arr)
    {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
        for(int i:map.keySet())
        {
            if(map.get(i) %2!=0)
            {
                return i;
            }
        }
        return 0;

    }
}
