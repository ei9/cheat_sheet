/*
 * Calculate the appearance of each letter in the String.
 * input: aaabbc
 * output: a:3, b:2, c:1
 */
import java.util.Arrays;
import java.util.Scanner;

public class StringCheck {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        // 參考：
        // https://www.geeksforgeeks.org/how-to-remove-all-white-spaces-from-a-string-in-java/
        // 去掉多餘空白
        str = str.replaceAll("\\s", "");

        // 只留下英文字母
        str = str.replaceAll("[^A-Za-z]", "");

        // 如果沒有英文字母，就結束程式。
        if (str.length() == 0) {
            System.out.println("No English alphabet!");
            return;
        }

        // 換成小寫字母，參考：
        // https://www.tutorialspoint.com/java/java_string_tolowercase.htm
        str = str.toLowerCase();

        // 轉成字母陣列，參考：
        // https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#toCharArray--
        char[] arr = str.toCharArray();

        // 排序陣列
        Arrays.sort(arr);

        // 正在計算的目標
        char tmp = arr[0];
        int num = 1;
        for (int i = 1 ; i < arr.length ; i++) {
            if (tmp == arr[i]) {
                num++;
            } else {
                System.out.println(tmp + ":" + num);
                tmp = arr[i];
                num = 1;
            }
        }
        System.out.println(tmp + ":" + num);
    }
}
