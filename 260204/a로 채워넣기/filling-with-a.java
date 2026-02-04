import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] arr = str.toCharArray();
        int n = arr.length;

        arr[1] = 'a';
        arr[n - 2] = 'a';

        System.out.println(new String(arr));
    }
}
