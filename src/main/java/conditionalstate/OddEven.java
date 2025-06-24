package conditionalstate;

import java.util.Scanner;

public class OddEven
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int a = sc.nextInt();

        if(a%2!=0)   //7
        {
            System.out.println("num is even");
        }
        else
        {
            System.out.println("num is odd");
        }
    }
}
 // age =16
//age>=18