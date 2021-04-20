/*
 * Calculate the appearance of each letter in the String.
 * input: Hello world
 * output: {D:1}{E:1}{H:1}{L:3}{O:2}{R:1}{W:1}
 */
import java.util.Scanner;

public class StringCheckByLN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toUpperCase();
        sc.close();

        int[] arr = new int[26];

        for(int i=0;i<str.length();i++)
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                arr[str.charAt(i)-'A']++;

        for(int i =0;i<26;i++)
            if(arr[i]>0)
                System.out.printf("{%c:%d}",(char)(i+'A'),arr[i]);
    }
}
