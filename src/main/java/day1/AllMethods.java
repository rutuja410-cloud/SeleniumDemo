package day1;

import java.util.Scanner;

public class AllMethods
{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter long number : ");
        long num = sc.nextLong();
        System.out.println("Enter long number : "+num);

        System.out.println("Enter char : ");
        char ch = sc.next().charAt(2);
        System.out.println("Enter char : "+ch);

        System.out.println("Enter ht : ");
        float ht = sc.nextFloat();
        System.out.println("Enter ht : "+ht);

        System.out.println("Enter wieght : ");
        double wt = sc.nextDouble();
        System.out.println("Enter wieght : "+wt);

        System.out.println("Enter the adress : ");
        sc.nextLine();
        String ad = sc.nextLine();
        System.out.println("Enter the adreess : "+ad);

        System.out.println("Enter boolean value : ");
        boolean bv = sc.nextBoolean();
        System.out.println("Enter boolean value : "+bv);

        sc.close();








    }
}
