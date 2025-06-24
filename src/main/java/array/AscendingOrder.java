package array;

public class AscendingOrder
{
    public static void main(String[] args)
    {
        int[] num = {5, 2, 4, 9, 3};

        for(int i=0; i<num.length;i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {

                    int temp = num[i]; //temp=5
                    num[i] = num[j];  //num i=2
                    num[j] = temp;  // j=5

                }
            }
        }
        System.out.println("Ascending");
        for(int n : num)
        {
            System.out.println(n);
        }
    }

}
