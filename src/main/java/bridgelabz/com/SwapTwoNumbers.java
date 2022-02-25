package bridgelabz.com;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A: ");
		int a = sc.nextInt();
		System.out.println("Enter the value of B: ");
		int b = sc.nextInt();

		System.out.println("Before swapping numbers: " + a + "  " + b);
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("After swapping: " + a + "   " + b); // After swapping

	}

}
