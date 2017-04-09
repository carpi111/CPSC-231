/* Interest Calculator */

import java.util.Scanner;

public class Ch03Ex05
{
	public static void main(String[] argv)
	{
		Scanner input = new Scanner(System.in);

		double dblTotal = 1000;  // INITIAL COST
		double dblPaidOff = 0.0; // HOW MUCH HAS BEEN PAID
		double dblDeduction = 0; // WHAT REMAINS AFTER MONTHLY PAYMENT
		double dblInterest = 0;  // CURRENT MONTH'S INTEREST
		int intMonths = 0; 		 // HOW MANY MONTHS UNTIL PAID OFF

		while(dblPaidOff < 1000)
		{
			dblInterest = (dblTotal * 0.015);
			dblDeduction = 50 - dblInterest;

			dblPaidOff += dblDeduction;
			dblTotal -= dblDeduction;

			++intMonths;
		}

		System.out.println("\nIt will take you " + intMonths + " months to pay off the stereo.\n");
	}
}
