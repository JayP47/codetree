import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n;
    static int[][] grid;
    static ArrayList<int[]> bombPos = new ArrayList<>();
    static int[] bombTypes;
    static int max = 0;
    static int[][][] range = {
        {{-2, -1, 1, 2}, {0, 0, 0, 0}},
        {{-1, 1, 0, 0}, {0, 0, -1, 1}},
        {{-1, -1, 1, 1}, {-1, 1, -1, 1}}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
                if (grid[i][j] == 1) {
                    bombPos.add(new int[]{i, j});
                }
            }
        }

        bombTypes = new int[bombPos.size()];
        solve(0);
        
        System.out.println(max);
    }

    static void solve(int depth) {
        if (depth == bombPos.size()) {
            explosion(); 
            return;
        }

        for (int type = 0; type < 3; type++) {
            bombTypes[depth] = type;
            solve(depth + 1);
        }
    }

    static void explosion() {
        boolean[][] exploded = new boolean[n][n];
        int count = 0;

        for (int i = 0; i < bombPos.size(); i++) {
            int r = bombPos.get(i)[0];
            int c = bombPos.get(i)[1];
            int type = bombTypes[i];

            if (!exploded[r][c]) {
                exploded[r][c] = true;
                count++;
            }

            for (int j = 0; j < 4; j++) {
                int nr = r + range[type][0][j];
                int nc = c + range[type][1][j];

                if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
                    if (!exploded[nr][nc]) {
                        exploded[nr][nc] = true;
                        count++;
                    }
                }
            }
        }
        max = Math.max(max, count);
    }
}