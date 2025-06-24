package array;

public class DeclareArray
{
    public static void main(String[] args)
    {
        int []num = {10, 20, 30, 40, 50};

        System.out.println(num[2]);
        System.out.println(num[4]);

       /* for(int i=0; i<num.length; i++)
        {
            System.out.println(num[i]);
        }*/

        for(int a : num)
        {
            System.out.println(a);
        }

    }

}
