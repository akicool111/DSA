package slidingwindow;

import java.util.HashMap;

public class CountOccurances {

    public static void main(String[] args) {
       String str="aabaabaa";
    }
    public static int countOccurances(String str,String s)
    {
        int ans=0;
        int i=0;
        int j=0;
        HashMap<Character,Integer> map= new HashMap<>();
        int count=0;

        for(int k=0;k<s.length();i++)
        {
            if(map.containsKey(s.charAt(k)))
            {
                map.put(s.charAt(k),map.get(s.charAt(k))+1);
            }
            else
            {
                map.put(s.charAt(k),1);
                count++;
            }
        }

        while(j<s.length())
        {
             if(map.containsKey(s.charAt(j)))
             {
                 //map.put();
             }
            if(j-i+1<s.length())
            {

                j++;
            }
            else
            {

                j++;
                i++;
            }
        }

        return count=0;
    }
}
