/*
 * Sorting numbers using Collections.
 * input: 2 34 32
 * output: 34 32 2
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(sc.nextLine());
        while(sc.hasNext()) {
            arr.add(sc.nextInt());
        }
        // Collections.sort(arr);  // 小 -> 大
        Collections.sort(arr, Collections.reverseOrder());  // 大 -> 小
        for (int i : arr)
            System.out.println(i);
    }
}
