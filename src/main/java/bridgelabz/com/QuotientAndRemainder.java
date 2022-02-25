package bridgelabz.com;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		num1 = sc.nextInt();
		System.out.println("Enter division by number : ");
		num2 = sc.nextInt();

		int quotient = num1 / num2;
		int remainder = num1 % num2;
		System.out.println("After division the quotient and remainder are: ");
		System.out.println("The quotient is: " + quotient);
		System.out.println("The remainder is: " + remainder);

	}

}
