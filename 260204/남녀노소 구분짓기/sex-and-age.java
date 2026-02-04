import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
    	int y = sc.nextInt();
    	
    	if(x==0) {
    		if(y<19) {
    			System.out.println("BOY");
    		} else {
    			System.out.println("MAN");    			
    		}
    	} else {
    		if(y<19) {
    			System.out.println("GIRL");
    		} else {
    			System.out.println("WOMAN");    			
    		}
    		
    	}
    }
}