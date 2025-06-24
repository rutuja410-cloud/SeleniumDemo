package oops;

/*class Car
{
    String color;   //instance variable
    int speed;

    void start()
    {
       // return 1;
       System.out.println("Car is starting");
    }
}*/

public class SimpleExample {
    String color;   //instance variable
    int speed;

    void start() {
        // return 1;
        System.out.println("Car is starting");
    }


    public static void main(String[]args)

    {
      /*  Car c = new Car(); //Creating an object
        c.start();  // calling a method

        c.color ="Red";  // setting values
        c.speed = 100;

        System.out.println("color : "+c.color);
        System.out.println("speed : "+c.speed);*/
        SimpleExample s = new SimpleExample();
        s.start();

        s.color ="Red";
        s.speed = 100;

        System.out.println("color : "+s.color);
        System.out.println("speed : "+s.speed);

    }
    }

