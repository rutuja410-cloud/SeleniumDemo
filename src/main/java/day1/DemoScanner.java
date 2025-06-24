package day1;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[]args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = a.nextInt();

        System.out.println("Enter second number : ");
        int num2 = a.nextInt();

        System.out.println("Sum of two digit: " + (num1 + num2));

    }
}
