package oops;

class Student
{
    String name;
    int age;

    void displayInfo()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);

    }
}

public class SimpleExample2
{
    public static void main(String[] args)
    {
       Student s = new Student();
       s.name ="Alice";
       s.age = 20;

       s.displayInfo();
    }
}
