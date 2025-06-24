package oops;
class Animal  // parent class / Super class
{
    void eat()
    {
        System.out.println("This animal eats food");

    }
}

class Doggy extends Animal  //child class/ Sub class
{
   void bark()
   {
       System.out.println("The dog barks");
   }
}


public class DemoSingle
{
    public static void main(String[]args)
    {
        Doggy d = new Doggy();
        d.eat();
        d.bark();
    }
}
