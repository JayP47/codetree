import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 1;
        for (int i = 0; i < x; i++) {
			for (int j = 0; j <= i ; j++) {
				System.out.print(n + " ");
				n++;
			}
			System.out.println();
		}
		
    }
}