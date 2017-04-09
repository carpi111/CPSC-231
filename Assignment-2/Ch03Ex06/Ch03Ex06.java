/* Green Crud Population */

import java.util.Scanner;

public class Ch03Ex06
{
	public static void main(String[] argv)
	{
		Scanner input = new Scanner(System.in);

		int intCurrentSize = 0;

		System.out.println("\nEnter the initial size of the population in pounds.");
		int intInitialSize = input.nextInt();

		System.out.println("\nEnter the number of days the population will grow.");
		int intDays = input.nextInt() / 5;

		int[] intArray = new int[intDays + 1];

		intArray[0] = intInitialSize;
		intArray[1] = intInitialSize;

		for(int i = 2; i <= intDays; ++i)
		{
			intArray[i] = intArray[i - 1] + intArray[i - 2];
		}

		intCurrentSize = intArray[intDays];
		System.out.println("\nThe size of the population will be " + intCurrentSize + " pounds.\n");
	}
}
