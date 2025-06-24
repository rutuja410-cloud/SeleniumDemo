package array;

import java.util.Scanner;

public class ScannerArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[3];

        System.out.println("enter 3 number");
        for(int i=0; i<num.length; i++)
        {
            num[i]= sc.nextInt();
        }
        System.out.println("entered ");
        for(int n: num)
        {
            System.out.println(n);
        }
    }
}
