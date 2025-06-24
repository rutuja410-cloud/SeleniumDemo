package conditionalstate;

public class CheckAgeGroup
{
    public static void main(String args[])
    {
        int age = 15;  // num=0

        if(age>0)
        {
            if(age<13)
            {
                System.out.println("Child");
            }
            else
            {
                System.out.println("Adult");
            }
        }
        else
        {
            System.out.println("invalid age");
        }
    }
}
