package oops;

class Parent   // Super class
{
    public void demoParent()
    {
        System.out.println("we are achieve parent property");
    }
}

class Child extends Parent           // subclass
{
    public void demoChild()
    {
        System.out.println("we are achieve parent property as well as child property");
    }
}


public class SingleInheritance
{
    public static void main(String []args)
    {
        // we are calling methods
        // we have create a object for class
        // How to create a object for particular class
        // always u are gooing to create a object for child class

        Child ch = new Child();  // creating object
        ch.demoChild();
        ch.demoParent();

    }
}
