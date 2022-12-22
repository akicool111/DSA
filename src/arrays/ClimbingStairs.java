package arrays;

public class ClimbingStairs {

    public static void main(String[] args) {
        int n=5;

        System.out.println(noOfSteps(n));
    }

    static int noOfSteps(int n)
    {
         Integer counter=new Integer(0);
        noOfSteps(n,counter);
       return counter;
    }

    static void noOfSteps(int n,int counter)
    {
        System.out.println(counter);
        if(n<0)
        {
            return;
        }
        if(n==0)
        {
            counter++;
        }
        noOfSteps(n-1,counter);
        noOfSteps(n-2,counter);
    }
}
