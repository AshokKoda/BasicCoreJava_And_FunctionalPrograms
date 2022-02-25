package bridgelabz.com;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		
		int a, b, c;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		a = sc.nextInt();
		System.out.print("Enter the second number: ");
		b = sc.nextInt();
		System.out.print("Enter the third number: ");
		c = sc.nextInt();

		System.out.println("<------------------------------->");
		if (a > b && a > c) {
			System.out.println("Largest number is: " + a);
		} else if (b > c) {
			System.out.println("Largest number is: " + b);
		} else {
			System.out.println("Largest number is: " + c);
		}
		
		System.out.println("<-------------Ternary Logic Output------------------>");
		int largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		System.out.println("The largest number is: " + largest);

	}

}
