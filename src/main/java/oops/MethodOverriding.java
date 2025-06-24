package oops;
class AminalClass
{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }
}

class DogClass extends AminalClass
{
    @Override
    void sound()
    {
        System.out.println("Dogs barks");
    }
}

class CatClass extends AminalClass
{
    @Override
    void sound()
    {
        System.out.println("cat meows");
    }
}

public class MethodOverriding
{
    public static void main(String[] args)
    {
        // reference variable
        // ParantClass Object_name = new child class();
        AminalClass a = new CatClass();
        AminalClass a1 = new DogClass();

        a.sound();
        a1.sound();
    }
}
