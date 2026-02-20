public class Main {
    public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 7;
		int tmp1 = a;
		int tmp2 = b;
		a = c;
		c = tmp2;
		b = tmp1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
    }
}