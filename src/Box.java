public class Box {

    double l;
    double h;
    double w;

    Box()
    {
         super();
        System.out.println("inside Box()");
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
}

 class BoxWeight extends Box{
   double wt;

   BoxWeight()
   {
       System.out.println("inside BoxWeight()");
       this.wt=-1;
   }


     public void display(char ch)
     {

     }
     public int display(String str)
     {
         return 1;
     }



     public static void main(String[] args) {
         Box box=new BoxWeight();



     }

}
