import java.util.Scanner;
public class Main {
	static boolean[][] visited;
	static boolean[][] graph;
	static int n, m;
	static int[] dr = {1,0};
	static int[] dc = {0,1};
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new boolean[n+1][m+1];
        visited = new boolean[n+1][m+1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
				int x = sc.nextInt();
				if(x==1) {
					graph[i][j] = true;
				}
			}
        }
        
        dfs(0,0);
        
        if(visited[n-1][m-1]) {
        	System.out.println(1);
        } else {
        	System.out.println(0);
        }
    }
    
    static void dfs(int r, int c) {
    	for (int i = 0; i < 2; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			if(!visited[nr][nc] && graph[nr][nc]) {
				visited[nr][nc] = true;
				dfs(nr,nc);
			}
		}
    }
}