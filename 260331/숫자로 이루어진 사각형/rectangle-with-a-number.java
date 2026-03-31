import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int num = 1;
        for (int i = 0 ; i < x ; i++){
            for (int j = 0 ; j < x ; j++){
                if(num%10==0){
                    num = 1;
                }
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}