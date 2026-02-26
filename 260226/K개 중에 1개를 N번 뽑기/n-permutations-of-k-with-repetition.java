import java.util.Scanner;

public class Main {
	static int k, n;
	static int[] res;
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();
        res = new int[n];
        
        combo(0);
    }
    
    static void combo(int depth) {
    	if(depth == n) {
    		for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
    		System.out.println();
    		return;
    	}
    	
    	for (int i = 1; i <= k; i++) {
			res[depth] = i;
			combo(depth+1);
		}
    }
}