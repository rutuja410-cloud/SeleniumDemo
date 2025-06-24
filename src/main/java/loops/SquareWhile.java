package loops;

public class SquareWhile
{
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            int square = i * i;
            System.out.println("Square of " + i + " is " + square);
            i++;
        }
    }
}
