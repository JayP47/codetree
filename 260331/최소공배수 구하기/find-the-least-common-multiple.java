import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = Math.max(n, m);
        
        while(true) {
        	if(max%n==0 && max%m==0) {
        		System.out.println(max);
        		return;
        	}
        	max++;
        }
    }
}