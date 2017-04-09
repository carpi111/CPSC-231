/* Classroom Grade */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ch03Ex09
{
	public static void main(String[] argv)
	{
		DecimalFormat formatObject = new DecimalFormat("0.00%");
		Scanner input = new Scanner(System.in);

		double dblExercisesSum = 0.0; // TOTAL SCORE RECEIVED ON ALL
		double dblTotalSum = 0.0; // TOTAL POINTS POSSIBLE

		System.out.println("\nEnter the number of excercises.");
		int intExercises = input.nextInt();

		for(int i = 1; i <= intExercises; ++i)
		{
			System.out.printf("\n\nEnter the score received on excercise %s.%n", i);
			dblExercisesSum += input.nextDouble();

			System.out.printf("\nEnter the total points possible for excercise %s.%n", i);
			dblTotalSum += input.nextDouble();
		}

		// GETS PERCENTAGE FROM SCORES AND FORMATS IT
		String strPercent = formatObject.format(dblExercisesSum / dblTotalSum);

		System.out.printf("\nYour score is %s out of %s total points, which is %s.%n%n", (int)dblExercisesSum, (int)dblTotalSum, strPercent);
	}
}
