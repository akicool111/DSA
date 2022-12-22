package recursion.easy;

public class Demo {

    public static void main(String[] args) {
       // fun(5);
        //int ans=sumdigits(10345);
        //System.out.println(ans);

        int ans1=countZeros1(11356);
        System.out.println(ans1);
    }

    static int countZeros1(int n)
    {
        return helper(n,0);
    }

    private static int helper(int n, int c) {
        if(n==0)
        {
            return c;
        }
        int rem=n%10;
        if(rem==0)
        {
            return helper(n/10,c+1);
        }

        return helper(n/10,c);

    }

    static int countZeros(int n)
    {
        if(n==0)
        {
            return 0;
        }

        int rem=n%10;

        if(rem==0)
        {
            return 1+countZeros(n/10);
        }
        return countZeros(n/10);

    }

    static int sumdigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int rem=n%10;

        return rem+sumdigits(n/10);

    }

    static int fact(int n)
    {
        if(n<=1)
        {
            return 1;
        }

        return n*fact(n-1);


    }
    static void fun(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }
}
