import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        while(x<=y) {
        	System.out.print(x + " ");
        	if(x%2==1) {
        		x*=2;
        	} else if(x%2==0) {
        		x+=3;
        	}
        }
    }
}
