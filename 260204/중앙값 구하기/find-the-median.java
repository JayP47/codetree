import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int mid;

        if ((B <= A && A <= C) || (C <= A && A <= B)) {
            mid = A;
        } else if ((A <= B && B <= C) || (C <= B && B <= A)) {
            mid = B;
        } else {
            mid = C;
        }

        System.out.println(mid);
    }
}
