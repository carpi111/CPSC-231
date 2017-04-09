/* Adult Height Calculator */

// EVERYTHING HERE WORKS UNTIL YOU LOOP
// BACK TO THE FIRST QUESTION AT THE END

import java.util.Scanner;

public class Ch03Ex03
{
	public static void main(String[] argv)
	{
		Scanner input = new Scanner(System.in);

		int intMotherHeightFeet, intMotherHeightInches; // MOTHER'S HEIGHT
		int intFatherHeightFeet, intFatherHeightInches; // FATHER'S HEIGHT
		int intFemaleHeightFeet, intFemaleHeightInches; // FEMALE'S HEIGHT
		int intMaleHeightFeet, intMaleHeightInches; 	// MALE'S HEIGHT
		
		boolean boolRunning = true;
		boolean boolGender = true;

		while(boolRunning)
		{
			System.out.println("\nWould you like to calculate the adult height of a child?\n1 - Yes\n2 - No\n");
			int intExit = input.nextInt();

			switch(intExit)
			{
				// YES
				case 1:

					while(boolGender)
					{
						System.out.println("\nWhat gender is the child?\n1 - Male\n2 - Female\n");
						int intGender = input.nextInt();

						switch(intGender)
						{
							// BOY
							case 1:
								boolGender = false;

								System.out.print("\nEnter the height of the boy's mother.\nFeet - ");
								intMotherHeightFeet = input.nextInt();

								System.out.print("Inches - ");
								intMotherHeightInches = input.nextInt();

								System.out.print("\nEnter the height of the boy's father.\nFeet - ");
								intFatherHeightFeet = input.nextInt();

								System.out.print("Inches - ");
								intFatherHeightInches = input.nextInt();

								int intMaleHeight = ((((intMotherHeightFeet * 12) + intMotherHeightInches) * 13 / 12) + ((intFatherHeightFeet * 12) + intFatherHeightInches)) / 2;

								System.out.println("\n\nThe estimated adult height of the boy is " + (intMaleHeight / 12) + "' " + (intMaleHeight % 12) + "\".\n");
								break;

							// GIRL
							case 2:
								boolGender = false;

								System.out.print("\nEnter the height of the girl's mother.\nFeet - ");
								intMotherHeightFeet = input.nextInt();

								System.out.print("Inches - ");
								intMotherHeightInches = input.nextInt();

								System.out.print("\nEnter the height of the girl's father.\nFeet - ");
								intFatherHeightFeet = input.nextInt();

								System.out.print("Inches - ");
								intFatherHeightInches = input.nextInt();

								int intFemaleHeight = ((((intFatherHeightFeet * 12) + intFatherHeightInches) * 13 / 12) + ((intMotherHeightFeet * 12) + intMotherHeightInches)) / 2;

								System.out.println("\n\nThe estimated adult height of the girl is " + (intFemaleHeight / 12) + "' " + (intFemaleHeight % 12) + "\".\n");
								break;

							default:
								System.out.println("\nYou didn't pick a gender. Try again.");
						}
					}
					break;
				
				// NO
				case 2:
					boolRunning = false;
					System.out.println("\nSee ya!\n");
					break;
				
				default:
					System.out.println("\nYou didn't chose a valid answer. Try again.");
			}
		}
	}
}
