package array;

public class ArrayString
{
    public static void main(String[] args)
    {
        String [] fruits ={"Apple", "Banana", "Cherry", "orange", "Mango"};

       /* for(int i=0; i<fruits.length; i++)
        {
            System.out.println(fruits[i]);
        }*/

        for(String f : fruits)
        {
            System.out.println(f);
        }
    }
}

