package recursion;

import java.util.ArrayList;

public class SubSet {

    public static void main(String[] args) {
     //  subset("","abc");
        System.out.println(subsetReq("","abc"));
    }

    private static ArrayList<String> subsetReq(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subsetReq(p+ch,up.substring(1));
        ArrayList<String> right=subsetReq(p,up.substring(1));

        left.addAll(right);

        return left;
    }
    private static void subset(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subset(p+ch,up.substring(1));
        subset(p,up.substring(1));
    }
}
