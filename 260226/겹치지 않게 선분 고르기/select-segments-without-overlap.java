import java.util.Scanner;

public class Main {
    static int[][] segments;
    static int n, max;
    static boolean[] visited;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        segments = new int[n][2];
        for (int i = 0; i < n; i++) {
            segments[i][0] = sc.nextInt();
            segments[i][1] = sc.nextInt();
        }
        visited = new boolean[n];
        max = 0;

        maxLines(0, 0); 
        
        System.out.println(max);
    }
    
    static void maxLines(int lastRight, int cnt) {
        max = Math.max(max, cnt);

        for (int i = 0; i < n; i++) {
            if (!visited[i] && segments[i][0] > lastRight) {
                visited[i] = true;
                maxLines(segments[i][1], cnt + 1);
                visited[i] = false;
            }
        }
    }
}