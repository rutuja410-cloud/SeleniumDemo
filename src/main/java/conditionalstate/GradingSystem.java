package conditionalstate;

import java.util.Scanner;

public class GradingSystem
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int marks = sc.nextInt();

        if(marks>=90)
        {
            System.out.println("Grade A");
        }
        else if (marks>=75)
        {
            System.out.println("Grade B");
        }
        else if (marks>=60)
        {
            System.out.println("Grade c");
        }
        else if (marks>=40)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
