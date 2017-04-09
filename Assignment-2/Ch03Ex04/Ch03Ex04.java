/* Inflation Calculator */

import java.util.Scanner;

public class Ch03Ex04
{
	public static void main(String[] argv)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("\nEnter the current cost of the item.\n$");
		double dblItemCost = input.nextDouble();

		System.out.println("\nEnter the number of years from now the item will be purchased.");
		int intYears = input.nextInt();

		System.out.println("\nEnter the rate of inflation as a percentage.");
		double dblInflation = input.nextDouble() / 100.0;

		// CALCULATE INFLATION
		for(int i = 0; i < intYears; ++i)
		{
			dblItemCost *= 1.0 + dblInflation;
		}
		System.out.printf("\nThe future price of the item will be $%.2f.%n%n", dblItemCost);
	}
}
