import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("-> ");
        int input = in.nextInt();

        if (input <= 1) {
            System.out.println("IllegalArgument");
            System.exit(-1);
        }

        int it = 0;
        boolean isPrime = true;
        if (input <= 3)
        {
            isPrime = (input % 2 == 0);
            it++;
        }
        else {
            int i;
            for (i = 3; i <= input / i; i++) {
                it++;
                if (input % i == 0) {
                    isPrime = false;
                    break;
                }
            }

        }
        System.out.println(isPrime + " " + it);
    }
}
