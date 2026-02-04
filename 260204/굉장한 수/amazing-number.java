import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
    	if((x%2==1 && x%3==0) || (x%2==0 && x%5==0)) {
    		System.out.println("True");
    	} else {
    		System.out.println("False");
    	}
    }
}