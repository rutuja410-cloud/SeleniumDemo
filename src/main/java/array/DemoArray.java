package array;

public class DemoArray
{
    public static void main(String[] args)
    {
       int []ar = new int[7];
        //int ar[] = new int[7]; //Syntax of array
        ar[0] = 12;
        ar[1] = 23;
        ar[2] = 32;
        ar[3] = 42;
        ar[4] = 52;
        ar[5] = 65;
        ar[6] = 70;

      //  System.out.println(ar[6]);

      /*  for(int i=0; i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }  */

        //Syntax ==> for(datatype anyVariable_Name : specify datatype)

        for(int p : ar )
        {
            System.out.println(p);
        }
    }
}
