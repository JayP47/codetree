import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = 0;
    	for (int i = x; i <= y; i++) {
            int cnt = 0;
    		for (int j = 1; j <= y; j++) {
				if(i%j==0) {
					cnt++;
				}
			}
    		if(cnt==3) {
    			result++;
    		}
    	}
    	
    	System.out.println(result);
		
    }
}