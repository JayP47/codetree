import java.util.Scanner;
public class Main {
	static boolean[] visited;
	static boolean[][] graph;
	static int n, m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new boolean[n+1][n+1];
        visited = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            graph[r][c] = true;
            graph[c][r] = true;
        }
        
        dfs(1);
        
        int cnt = -1;
        for (int i = 1; i < n+1; i++) {
			if(visited[i]) {
				cnt++;
			}
		}
        System.out.println(cnt);
    }
    
    static void dfs(int num) {
    	if(!visited[num]) {
    		visited[num] = true;
    		for (int i = 1; i < n+1; i++) {
				if(graph[num][i]) {
					dfs(i);
				}
			}
    	}
    }
}