package oops;

class PolymorphismExam
{
    //method with int parameter
    void display(int num)
    {
        System.out.println("int value : "+num);
    }
    //method with float parameter
    void display(float num)
    {
        System.out.println("float value : "+num);
    }
    //method with String parameter
    void display(String text)
    {
        System.out.println("String value : "+text);
    }
    //method with float parameter
    void display(int num, String text)
    {
        System.out.println("string and integer : "+num +" "+text);
    }
    //method with int, float parameter
    void display(float num, int n)
    {
        System.out.println("float, int value : "+num+" "+n);
    }

}

public class ExamplePolymorphism
{
    public static void main(String[]args)
    {
        PolymorphismExam p = new PolymorphismExam();
        p.display(20);
        p.display(7.8f);
        p.display("hello");
        p.display(5f, 67);
    }
}
