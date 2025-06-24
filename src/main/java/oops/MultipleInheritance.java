package oops;

interface AnimalDemo
{
   void eat();
}

interface PetAnimal
{
    void play();
}

class DogDemo implements AnimalDemo, PetAnimal
{
   public void eat()
    {
        System.out.println("Dog is eating");
    }
    public void play()
    {
        System.out.println("Dog is playing");
    }

}
public class MultipleInheritance
{
    public static void main(String[] args)
    {
        DogDemo d = new DogDemo();
        d.eat();
        d.play();
    }
}
