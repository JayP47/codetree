import java.util.Scanner;

public class Main {
    static int n;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        beautiful(0);
        System.out.println(count);
    }

    static void beautiful(int length) {
        if (length == n) {
            count++;
            return;
        }

        for (int i = 1; i <= 4; i++) {
            if (length + i <= n) {
                beautiful(length + i);
            }
        }
    }
}