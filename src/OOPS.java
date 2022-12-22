public class OOPS {
     public static void greetings()
     {
         System.out.println("Inside OOPS greetings");
     }
    public static void main(String[] args) {
        OOPS o1=new ChildOops();

        o1.greetings();
    }
}

class ChildOops extends  OOPS
{
    public static void greetings()
    {
        System.out.println("Inside ChildOops greetings");
    }
}
