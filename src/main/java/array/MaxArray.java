package array;

public class MaxArray
{
    public static void main(String[] args)
    {
        int[] num = {5, 2, 4, 9, 3}; //9

        int max = num[0];

        for (int i=1; i<num.length; i++) //i=4
        {
            if(num[i]<max)  // 2>5. 4>5. , 9>5, 3>9
            {
                max=num[i];  // max=9
            }
        }
        System.out.println(max);
    }
}
