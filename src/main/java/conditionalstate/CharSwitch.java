package conditionalstate;

import java.util.Scanner;

public class CharSwitch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice : ");
        char ch = sc.next().charAt(0);

        switch (ch)
        {
            case 'A':
                System.out.println("Excellent!");
                break;

            case 'B':
                System.out.println("Good job!");
                break;

            case 'C':
                System.out.println("Well done!");
                break;

            case 'D':
                System.out.println("you passed!");
                break;

            case 'E':
                System.out.println("Better try again!");
                break;

            default:
                System.out.println("invalid grade!");

        }
    }
}
