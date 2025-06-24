package loops;

public class NumSum
{
    public static void main(String[] args)
    {
        int num=57679; // 34
        int sum =0;

        while (num>0)
        {
            sum = sum+num %10;
            num = num/10;
        }
        System.out.println("ASum og digit "+sum);

    }
}
