import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
    	boolean year = false;
    	if(x%4==0) {
    		year = true;
    	} else {
    		year = false;
    	}
    	if(x%100==0) {
    		year=false;
    	}
    	System.out.println(year);
    }
}