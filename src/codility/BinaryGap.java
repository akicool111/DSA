package codility;

public class BinaryGap {

    public static void main(String[] args) {

        int i=10;
       // System.out.println(solution(9));
        int k=3/2;
        System.out.println(k);
    }
    public static int solution(int n)
    {
        String bstring=Integer.toString(n,2);

        System.out.println(bstring);

        boolean started=false;
        int counter=0;
        int max=0;
        for(int i=0;i<bstring.length();i++)
        {
            char ch=bstring.charAt(i);
            if(ch =='1')
            {
               if(started)
               {
                   max=Math.max(max,counter);
               }
               started=true;
               counter=0;

            }
            else
            {
                counter++;
            }
        }

        return max;

    }
}
