import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
    	if(x%13==0 || x%19==0) {
    		System.out.println("True");
    	} else {
    		System.out.println("False");
    	}
    }
}