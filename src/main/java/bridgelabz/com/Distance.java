package bridgelabz.com;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X value:");
		int x = sc.nextInt();

		System.out.println("Enter Y value:");
		int y = sc.nextInt();

		double dist = Math.sqrt(x * x + y * y);
		System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);

	}

}
