/*
 * Counting n!
 */
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("N! = ");
        System.out.println("For loop: " + usingForLoop(n));
        System.out.println("Factorial: " + fac(n));
    }

    /*
     * 使用for迴圈計算N!
     */
    static int usingForLoop(int n) {
        for (int i = n - 1 ; i > 0 ; i--)
            n *= i;
        return n;
    }

    /*
     * 使用遞迴計算N!
     */
    static int fac(int n) {
        return n == 1 ? n : n * fac(n - 1);
    }
}
