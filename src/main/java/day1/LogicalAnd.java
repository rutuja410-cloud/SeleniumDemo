package day1;

public class LogicalAnd
{
    public static void main(String[] args)
    {
        int a=10, b=5, c=20;

        // Comparing a>=b & b<=c
        System.out.println("a>=b & b<=c :"+(a>=b && b<=c));  //true

        // Comparing c>=a & a<=c
        System.out.println("c>=a & a<=b :"+(c>=a && a<=b));  //false


    }
}
