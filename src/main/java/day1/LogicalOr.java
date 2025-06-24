package day1;

public class LogicalOr
{
    public static void main(String[] args)
    {
        int a=20, b=30, c=10;

        //comparing a>=b & b<=c
        System.out.println("a>=b & b<=c ==> "+(a>=b || b<=c)); // false

        //comparing b>=a & a<=c
        System.out.println("b>=a & a<=c ==> "+(b>=a || a<=c)); //  true
    }
}
