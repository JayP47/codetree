import java.util.Scanner;
public class Main {
	static int n,m;
	static int[] row = {0,0,1,-1};
	static int[] col = {1,-1,0,0};
	static int[][] grid;
	static boolean[][] visited;
	static boolean canGo;
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        
        findPath(0,0);
        if(canGo) {
        	System.out.println(1);
        } else {
        	System.out.println(0);
        }
    }
    
    static void findPath(int r, int c) {
    	visited[r][c] = true;
    	if(canGo) {
    		return;
    	}
    	if(r==n-1 && c == m-1) {
    		canGo = true;
    		return;
    	}
    	for (int i = 0; i < 4; i++) {
			int nr = r+row[i];
			int nc = c+col[i];
			if(0<=nr && nr<n && 0<=nc && nc<m && grid[nr][nc]==1 && !visited[nr][nc]) {
				findPath(nr,nc);
			}
		}
    }
}