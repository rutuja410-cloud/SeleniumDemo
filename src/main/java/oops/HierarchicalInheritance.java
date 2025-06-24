package oops;

class Father
{
    void fatherProp()
    {
        System.out.println("This is father property");
    }
}

class John extends Father
{
    void johnProp()
    {
        System.out.println("This is john property");
    }
}

class Alard extends Father
{
    void alardProp()
    {
        System.out.println("This is Alard property");
    }
}

public class HierarchicalInheritance
{
    public static void main(String[]args)
    {
        John j = new John();
        j.johnProp();
        j.fatherProp();

        Alard a = new Alard();
        a.alardProp();
        a.fatherProp();
    }

}
