import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] arr = new int[10];
        arr[0] = x;
        arr[1] = y;
        for (int i = 2; i < 10; i++) {
			arr[i] = arr[i-2]+arr[i-1];
		}
        
        for (int i = 0; i < 10; i++) {
			System.out.print(arr[i]%10 + " ");
		}
    }
}
