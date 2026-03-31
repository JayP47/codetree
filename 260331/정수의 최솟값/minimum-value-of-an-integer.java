import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int o = sc.nextInt();
        
        System.out.println(min(n,m,o));
    }
    
    static int min(int a, int b, int c) {
    	return Math.min(Math.min(a, b),c);
    }
}