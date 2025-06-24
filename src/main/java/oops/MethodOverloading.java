package oops;

class Calculator
{
    //method to add two integer
    int add(int a, int b)
    {
        return a+b;
    }
    //method to add three integer
    int add(int a, int b, int c)
    {
        return a+b+c;
    }
    //method to add two double numbers
    double add(double a, double b)
    {
        return a+b;
    }
    //method to add two double numbers
    float add(float a, float b, float c, float d)
    {
        return a+b+c+d;
    }

}

public class MethodOverloading
{
    public static void main(String []args)
    {
        Calculator c = new Calculator();
        c.add(5, 10);
        c.add(5,10, 20);
        c.add(5.676, 6.7878);
        c.add(2.3f, 4.5f, 23.5f, 3.67f);

        System.out.println("output1 : " +c.add(5, 10));
        System.out.println(c.add(5,10, 20));
        System.out.println( c.add(5.676, 6.7878));
        System.out.println( c.add(2.3f, 4.5f, 23.5f, 3.67f));
    }
}
