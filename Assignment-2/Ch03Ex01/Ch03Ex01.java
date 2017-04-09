/* Babylonian Square Root */

import java.lang.Math;
import java.util.Scanner;

public class Ch03Ex01
{
	public static void main(String[] argv)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("\nInput the number you would like to take the square root of.\n");
		double dblNum = input.nextDouble();
		
		double dblGuess = dblNum / 2;
		double dblGuess2 = 0.0;
		double dblBabyl;
		
		// WHILE THE CURRENT & PREVIOUS GUESSES ARE MORE THAN 1% AWAY FROM EACH OTHER
		while(Math.abs(dblGuess - dblGuess2) > (dblGuess / 100))
		{
			dblGuess2 = dblGuess;
			dblBabyl = dblNum / dblGuess;
			dblGuess = (dblGuess + dblBabyl) / 2;
		}

		System.out.printf("\nThe square root of %s is %.2f.%n%n", dblNum, dblGuess);
	}
}
