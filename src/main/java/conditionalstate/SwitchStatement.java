package conditionalstate;

import java.util.Scanner;

public class SwitchStatement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 number ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter choice : ");
        char ch = sc.next().charAt(0);

        switch(ch)
        {
            case '+':
                System.out.println("Add: "+(a+b));
                break;

            case '-' :
                System.out.println("Sub: "+(a-b));
                break;

            case '/':
                System.out.println("div: "+(a/b));
                break;

            case '*':
                System.out.println("Multi: "+(a*b));
                break;

            case '%':
                System.out.println("mod: "+(a%b));
                break;

            default:
                System.out.println("invalid choice");

        }
    }
}
