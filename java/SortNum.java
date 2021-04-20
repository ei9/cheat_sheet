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
        String str = sc.nextLine();
        sc.close();
        sc = new Scanner(str);
        while(sc.hasNext()) {
            arr.add(sc.nextInt());
        }
        sc.close();
        // Collections.sort(arr);  // 小 -> 大
        Collections.sort(arr, Collections.reverseOrder());  // 大 -> 小
        for (int i : arr)
            System.out.println(i);
    }
}
