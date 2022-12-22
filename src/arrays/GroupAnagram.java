package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

    public static void main(String[] args) {
        String[] arr={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> list=groupAnagrams(arr);

        for(List<String> ls : list)
        {
            System.out.println(ls);
        }
        System.out.println();
    }
    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map=new HashMap<>();
        List<List<String>> list1=new ArrayList<>();
        for(int i=0;i<strs.length;i++)
        {
            String s=strs[i];
            char c[]=s.toCharArray();

            Arrays.sort(c);

            String sorted=new String(c);
            if(map.containsKey(sorted))
            {
                ArrayList<String> list=map.get(sorted);
                list.add(s);
            }
            else
            {
                ArrayList<String> ww=new ArrayList<>();
                ww.add(s);
                map.put(sorted,ww);
            }

        }



        list1.addAll(map.values());

        return list1;

    }
}
