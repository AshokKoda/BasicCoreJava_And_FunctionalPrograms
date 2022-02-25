package factors;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				System.out.print(i + " ");
				num = num / i;
			}
		}

	}

}
