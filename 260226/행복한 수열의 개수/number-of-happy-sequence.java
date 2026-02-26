import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        
        int cnt = 0;
        for (int i = 0; i < n; i++) {
        	int con = 1;
			for (int j = 1; j < n; j++) {
				if(grid[i][j] == grid[i][j-1]) {
					con++;
				} else {
					con = 1;
				}
			}
			if(con>=m) {
				cnt++;
			}
			con = 1;
			for (int j = 1; j < n; j++) {
				if(grid[j][i] == grid[j-1][i]) {
					con++;
				} else {
					con = 1;
				}
			}
			if(con>=m) {
				cnt++;
			}
		}
        
        System.out.println(cnt);
    }
}