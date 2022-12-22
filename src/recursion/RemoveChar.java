package recursion;

public class RemoveChar {
    public static void main(String[] args) {
        String str="bappleccad";
        char c='c';
      //  System.out.println(removeChars(str,c));
       // System.out.println(removeChars1(str));

        System.out.println(removeApple(str));
    }

    public static String removeApple(String str) {
        if(str.length()==0)
        {
            return "";
        }

        if (str.startsWith("apple"))
        {
            return removeApple(str.substring(5));
        }

        return str.charAt(0)+removeApple(str.substring(1));
    }
    public static String removeChars(String str,char c)
    {
       // StringBuilder sb=new StringBuilder(str);
        return remove(str,c,0);
    }


    public static String removeChars1(String str) {
        if(str.length()==0)
        {
            return "";
        }
        char c = str.charAt(0);
        if (c == 'a')
        {
            return removeChars1(str.substring(1));
        }

        return c+removeChars1(str.substring(1));
    }

    public static String remove(String str,char c,int pos)
    {
        if(pos>=str.length())
        {
            return "";
        }
        if(str.charAt(pos)!=c)
        {
            return str.charAt(pos)+remove(str,c,pos+1);
        }
        return remove(str,c,pos+1);

    }
}
