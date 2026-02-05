import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
        	int x = sc.nextInt();
        	int y = sc.nextInt();
			int sum = 0;
        	for (int j = x; j <= y; j++) {
				if(j%2==0) {
					sum+=j;
				}
			}
        	System.out.println(sum);
		}
    }
}