import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		int x = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the threshold:");

		x = scan.nextInt();

		new Fib().Fibo(0, 0, x);

	}

	 void Fibo(int a, int b, int len) {
		int x = 0, y = 1, c = 0;
		if (a == 0 && b == 0)
			System.out.print("0, 1");
		else {
			c = a + b;
			x = b;
			y = c;
		}

		if (c < len) {
			System.out.print(", " + c);
			Fibo(x, y, len);
		}

	}

}
