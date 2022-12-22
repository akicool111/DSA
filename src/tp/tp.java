package tp;

public class tp {
    static int a=4;

    static {
        a=a*5;
    }

    public static void main(String  ...args) {

       // System.out.println("aaa : "+tp.a);

        int i=9;
        int j=07;

        System.out.println(i);
        System.out.println(j);

       // tp t=new tp();
      //  t.greetings();
    }
    public void fun()
    {
        greetings();
    }
    public void greetings()
    {
        System.out.println("hello world");
    }
}
