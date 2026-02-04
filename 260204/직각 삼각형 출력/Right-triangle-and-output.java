import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        
        for (int i = x; i > 0; i--) {
			for (int j = 0; j < (x-i)*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
    }
}
