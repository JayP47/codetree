import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
			arr[i] = i+1;
		}
        
        int[][] arr2 = new int[n][n];
        for (int i = 0; i < n; i++) {
        	if(i%2==0) {
        		for (int j = 0; j < n; j++) {
        			arr2[j][i] = arr[j];
        		}        		
        	} else {
        		for (int j = n-1; j >= 0; j--) {
        			arr2[j][i] = arr[n-j-1];
        		}        		
        	}
        }
        
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr2[i][j]);
			}
			System.out.println();
		}
    }
}