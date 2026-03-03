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
        
        int maxGold = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k <= n + 1; k++) {
                    int goldCnt = 0;
                    for (int r = 0; r < n; r++) {
                        for (int c = 0; c < n; c++) {
                            if (Math.abs(i - r) + Math.abs(j - c) <= k) {
                                if (grid[r][c] == 1) {
                                    goldCnt++;
                                }
                            }
                        }
                    }

                    int cost = k * k + (k + 1) * (k + 1);
                    if (goldCnt * m >= cost) {
                        maxGold = Math.max(maxGold, goldCnt);
                    }
                }
            }
        }
        System.out.println(maxGold);
    }
}