package bridgelabz.com;

import java.util.Scanner;

public class EvenAndOddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		// Case: 1 Using if condition
		if (num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");

		System.out.println("<------------------------------------>");
		// Case: 2 Using ternary operator
		String evenOdd = (num % 2 == 0) ? "even" : "odd";
		System.out.println(num + " is " + evenOdd);

		System.out.println("<------------------------------------>");
		// Case: 3 Using For loop (print tables upto 10)
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}

	}

}
