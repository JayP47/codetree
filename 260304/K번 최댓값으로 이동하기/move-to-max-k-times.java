import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] grid = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				grid[i][j] = sc.nextInt();
		int r = sc.nextInt() - 1;
		int c = sc.nextInt() - 1;
		int[] dr = { 0, 0, 1, -1 };
		int[] dc = { 1, -1, 0, 0 };

		for (int i = 0; i < k; i++) {
			Queue<int[]> q = new LinkedList<>();
			q.offer(new int[] { r, c });
			boolean[][] canGo = new boolean[n][n];
			canGo[r][c] = true;
			int start = grid[r][c];
			int max = -1;
			while (!q.isEmpty()) {
				int[] cur = q.poll();
				int curR = cur[0];
				int curC = cur[1];

				for (int j = 0; j < 4; j++) {
					int nr = curR + dr[j];
					int nc = curC + dc[j];

					if (0 <= nr && nr < n && 0 <= nc && nc < n && !canGo[nr][nc] && grid[nr][nc] < start) {
						max = Math.max(max, grid[nr][nc]);
						canGo[nr][nc] = true;
						q.offer(new int[] { nr, nc });
					}
				}
			}

			if(max==-1) {
				break;
			}
			
			outer:
			for (int j = 0; j < n; j++) {
				for (int l = 0; l < n; l++) {
					if (grid[j][l] == max && canGo[j][l]) {
						r = j;
						c = l;
						break outer;
					}
				}
			}
		}

		System.out.println((r + 1) + " " + (c + 1));

	}
}