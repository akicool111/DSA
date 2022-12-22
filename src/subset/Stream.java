package subset;

import recursion.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {

    public static void main(String[] args) {
       // skip("","Aakash");

       // System.out.println(skip("qAakash"));
      //ArrayList<String> list=  subset("","abc");
        int[] arr=new int[]{1,2,2};
        System.out.println(subsetDuplicate(arr));
    }

    static List<List<Integer>> subsetDuplicate(int[] arr)
    {
        Arrays.sort(arr);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        int start=0;
        int end=0;


        for(int i=0;i<arr.length;i++)
        {
            start=0;

            if(i>0 && arr[i]==arr[i-1])
            {
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();

            for(int j=start;j<n;j++)
            {
                List<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
    static List<List<Integer>> subset(int[] arr)
    {
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num:arr)
        {
            int n=outer.size();

            for(int i=0;i<n;i++)
            {
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }
    public static ArrayList<String> subset(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
         //   System.out.println(p);
            return list;
        }
        char ch=up.charAt(0);
       ArrayList<String> left= subset(p+ch,up.substring(1));
       ArrayList<String> right= subset(p,up.substring(1));
       left.addAll(right);
       return left;
    }
      public static String skipAppNotApple(String up)
      {
          if(up.isEmpty())
          {
              return "";
          }
          if(up.startsWith("App") && !up.startsWith("Apple"))
          {
              return skipAppNotApple(up.substring(3));
          }
          else
          {
              return up.charAt(0)+skipAppNotApple(up.substring(1));
          }
      }
    public static String skipApple(String up)
    {
        if(up.isEmpty())
        {
            return "";
        }
        if(up.startsWith("Apple"))
        {
            return skipApple(up.substring(5));
        }
        else
        {
            return up.charAt(0)+skipApple(up.substring(1));
        }

    }
    public static String skip(String up)
    {
        if(up.isEmpty())
        {
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a')
        {
            return skip(up.substring(1));
        }
        else
        {
            return ch+skip(up.substring(1));
        }
    }
    public static void skip(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a')
        {
            skip(p,up.substring(1));
        }
        else
        {
            skip(p+ch,up.substring(1));
        }
    }
}
