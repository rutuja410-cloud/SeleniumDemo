package loops;

public class PrintStar1
{
    public static void main(String args[])
    {
        for(int i=1; i<=3; i++) // row
        {
            for(int j=1; j<=4; j++) // column
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
