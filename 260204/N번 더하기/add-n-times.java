import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
    	int y = sc.nextInt();
    	for (int i = 0; i < y; i++) {
			System.out.println(x+y);
			x+=y;
		}
    }
}