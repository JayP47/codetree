import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = (n>m?m:n);
        for(int i = start ; i > 0 ; i--){
            if(n%i==0 && m%i==0){
                System.out.println(i);
                return;
            }
        }
    }
}