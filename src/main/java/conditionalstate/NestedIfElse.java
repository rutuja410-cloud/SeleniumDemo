package conditionalstate;

public class NestedIfElse
{
    public static void main(String args[])
    {
        int a=10, b=20, c=30;

        if(a<b)
        {
          if(b<c)
          {
              System.out.println("a is largest");
          }
          else
          {
              System.out.println("b is largest");
          }
        }
        else
        {
            System.out.println("c is largest");
        }
    }
}
