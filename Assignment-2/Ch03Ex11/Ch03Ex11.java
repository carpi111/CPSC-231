/* Prizes for Finalists */

import java.util.Random;

public class Ch03Ex11
{
	public static void main(String[] argv)
	{
		Random intRand = new Random();
		
		int intPrize1 = intRand.nextInt(30) + 1;
		int intPrize2 = intRand.nextInt(30) + 1;
		int intPrize3 = intRand.nextInt(30) + 1;

		// MAKES SURE NO WINNERS ARE CHOSEN TWICE
		while(intPrize1 == intPrize2 || intPrize2 == intPrize3 || intPrize1 == intPrize3)
		{
			intPrize1 = intRand.nextInt(30) + 1;
			intPrize2 = intRand.nextInt(30) + 1;
			intPrize3 = intRand.nextInt(30) + 1;
		}

		System.out.printf("\nThe three prize winners are %s, %s, and %s.%n%n", intPrize1, intPrize2, intPrize3);
	}
}
