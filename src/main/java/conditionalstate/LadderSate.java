package conditionalstate;

public class LadderSate {
    public static void main(String args[]) {
        int a = 10, b = 30, c = 20;

        if (a > b && b < c) {
            System.out.println("a is largest");
        }
        else if (b > c && b < a)
        {
            System.out.println("b is largest1");
        }
        else if (b < c && c > a)
        {
            System.out.println("c is largest");
        }
        else if (b > c && b > a) {
            System.out.println("b is largest2");
        }
        else if (a > b && c < a)
        {
            System.out.println("a is largest");
        }
        else
        {
            System.out.println("invalid");
        }

    }

}
