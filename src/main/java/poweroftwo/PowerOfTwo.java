package poweroftwo;

import java.util.Scanner;

public class PowerOfTwo {
	private static Scanner sc;

	public static void main(String[] args) {
		int number = 2, i, exponent;
        long power = 1;
        sc = new Scanner(System.in);

        System.out.print(" Please Enter the Exponent Value : ");
        exponent = sc.nextInt();

        for (i = 1; i <= exponent; i++) {
            power = power * number;
        }
        System.out.println("\n The Final result of " + number + " power " + exponent + " = " + power);
	}

}
