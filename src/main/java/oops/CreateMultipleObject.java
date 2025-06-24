package oops;

class Dog
{
    String name;

    void bark()
    {
        System.out.println(name +" is barking");
    }
}

public class CreateMultipleObject {
    public static void main(String[]args)
    {
        Dog d = new Dog();
        d.name = "Rocky";

        Dog d1 = new Dog();
        d1.name ="Marfi";

        Dog d2 = new Dog();
        d2.name ="Maxy";

        d.bark();
        d1.bark();
        d2.bark();


    }
}
