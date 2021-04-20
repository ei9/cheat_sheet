/*
 * Find max, min, average of a sequence.
 * 
 * Input: 
 * 3  # Following 3 numbers.
 * 1 2 3
 * 
 * Output:
 * max: 3
 * min: 1
 * average: 2.0
 */
import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0, min = Integer.MAX_VALUE;
        double sum = 0;

        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++) {
            int x = sc.nextInt();
            if (x > max)
                max = x;
            if (x < min)
                min = x;
            sum += x;
        }
        sc.close();
        System.out.println("max: " + max);
        System.out.println("min: " + min);
        System.out.println("average: " + (sum / n));
    }
}
