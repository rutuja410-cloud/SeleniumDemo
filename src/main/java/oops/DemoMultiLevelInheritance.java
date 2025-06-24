package oops;

class DemoAnimal
{
    void eat()
    {
        System.out.println("Aminal is eating");
    }
}

class mammal extends DemoAnimal
{
    void walk()
    {
        System.out.println("mammal is eating");
    }
}

class DemoDog extends mammal
{
    void bark()
    {
        System.out.println("Dog is barking");
    }
}

public class DemoMultiLevelInheritance
{
    public static void main(String[] args)
    {
         DemoDog d = new DemoDog();
         d.eat();
         d.walk();
         d.bark();
    }
}
