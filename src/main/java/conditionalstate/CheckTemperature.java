package conditionalstate;

import java.util.Scanner;

public class CheckTemperature
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int temp = sc.nextInt();

        if(temp>=40)
        {
            System.out.println("It's hot outside");
        }
        else if (temp>=30)
        {
            System.out.println("Its warm day ");
        }
        else if (temp>=20)
        {
            System.out.println("nice day");
        }
        else if (temp>=10)
        {
            System.out.println("getting cold");
        }
        else
        {
            System.out.println("its freezing");
        }
    }
}
