import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] arr1 = new int[x][y];
        int[][] arr2 = new int[x][y];
        for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
        for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				int tmp = sc.nextInt();
				if(arr1[i][j] == tmp) {
					System.out.print(0 + " ");
				} else {
					System.out.print(1 + " ");
				}
			}
			System.out.println();
		}
    }
}