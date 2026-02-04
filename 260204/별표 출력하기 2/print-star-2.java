import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        
        for (int i = 0; i < x; i++) {
			for (int j = x-i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
    }
}
