package bridgelabz.com;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("##.00");
		System.out.println("How many times you want to flip the coin?");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		int headCount = 0, tailCount = 0;

		for (int i = 0; i < count; i++) {
			if (Math.random() < 0.5) {
				tailCount++;
			} else {
				headCount++;
			}
		}

		System.out.println("Head count : " + headCount);
		System.out.println("Tail count : " + tailCount);

		String headPercentage = decimalFormat.format(((double) headCount / count) * 100);
		String tailPercentage = decimalFormat.format(((double) tailCount / count) * 100);

		System.out.println("Head Percentage : " + headPercentage + "%");
		System.out.println("Tail Percentage : " + tailPercentage + "%");

		sc.close();

	}

}
