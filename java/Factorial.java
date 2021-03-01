/*
 * Counting n!
 */
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();

        for (int i = n - 1 ; i > 0 ; i--)
            n *= i;

        System.out.println("N! = " + n);
    }
}
