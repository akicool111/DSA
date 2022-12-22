package pattern;

public class Pattern_1 {

    public static void main(String[] args) {
        pattern1(5);
    }

    public static void pattern1(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int noofspaces=n-row;
            for(int spaces=0;spaces<noofspaces;spaces++)
            {
                System.out.print("  ");
            }
            for(int col=row;col>=1;col--)
            {
                System.out.print(col+" ");
            }
            for(int col=2;col<=row;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
    public static void pattern(int n)
    {
        for(int row=1;row<=2*n ; row++)
        {
            int totalRowCount=row>n ? 2*n-row:row;

            int noOfSpaces=n-totalRowCount;
            for(int spaces=0;spaces<noOfSpaces;spaces++)
            {
                System.out.print(" ");
            }

            for(int col=0;col<totalRowCount;col++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
