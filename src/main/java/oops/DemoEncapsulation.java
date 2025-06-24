package oops;

class StudentDemo
{
    //private variable(data hiding)
    private String name;
    private String address;

    public void setName(String newName, String add)
    {
        name = newName;
        address=add;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
}

public class DemoEncapsulation
{
    public static void main(String[] args)
    {
        StudentDemo s = new StudentDemo();
        s.setName("John", "pune");

       System.out.println(s.getName());
        System.out.println(s.getAddress());


    }

}
