package oops;

interface DemooAnimal
{
    void eat();
}

class MammalDemo  //parent class
{
    void walk()
    {
        System.out.println("mammal is walking");
    }
}

class DogDemoo extends MammalDemo implements DemooAnimal
{
    public void eat()
    {
        System.out.println("Dog is eating");
    }
}
public class HybridInheritance
{
    public static void main(String []args)
    {
        DogDemoo dd = new DogDemoo();
        dd.walk();
        dd.eat();
    }
}
