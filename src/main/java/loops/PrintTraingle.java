package loops;

public class PrintTraingle
{
    public static void main(String args[])
    {
        for(int i=1; i<=4; i++) //i=1 i=2 i=3 i=4
        {
            for(int j=1; j<=i; j++) //1<=2. 2<=2
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
