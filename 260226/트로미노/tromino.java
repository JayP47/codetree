import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        
        int[] dr = {-1,1,1,-1};
        int[] dc = {1,1,-1,-1};
        int max = -1;
        
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < 4; k++) {
					int sum = grid[i][j];
					int nr = i+dr[k];
					int nc = j+dc[k];
					
					if(0<=nr && nr<n) {
						sum+=grid[nr][j];
					}
					if(0<=nc && nc<m) {
						sum+=grid[i][nc];
					}
					
					max = Math.max(max, sum);
				}
			}
		}
        
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < m-2; j++) {
				int sum = grid[i][j] + grid[i][j+1] + grid[i][j+2];
				max = Math.max(max, sum);
			}			
		}
        
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n-2; j++) {
        		int sum = grid[j][i] + grid[j+1][i] + grid[j+2][i];
        		max = Math.max(max, sum);
        	}			
		}
        
        
        System.out.println(max);
    }
}