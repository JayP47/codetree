import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(cond(n)?"Yes":"No");
    }
    
    static boolean cond(int a) {
    	return ((a%10+a/10)%5==0 && a%2==0);
    }
}