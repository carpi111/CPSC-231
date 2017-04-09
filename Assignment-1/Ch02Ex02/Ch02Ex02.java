import java.util.Scanner;

public class Ch02Ex02
{
	public static void main(String[] argv)
	{
		Scanner input = new Scanner(System.in); 													 						 // creates 'input' object of 'Scanner' class

		System.out.println("\nEnter your first name:");
		String strFirst = input.nextLine().toLowerCase(); 											 						 // takes next input as string and converts to lowercase

		System.out.println("\nEnter your last name:");
		String strLast = input.nextLine().toLowerCase(); 											 						 // takes next input as string and converts to lowercase

		String strPigFirst = strFirst.substring(1,2).toUpperCase() + strFirst.substring(2) + strFirst.substring(0,1) + "ay"; // converts first name input into pig latin

		String strPigLast = strLast.substring(1,2).toUpperCase() + strLast.substring(2) + strLast.substring(0,1) + "ay"; 	 // converts last name input into pig latin

		System.out.println("\nYour name in pig latin is " + strPigFirst + " " + strPigLast + ".\n"); 						 // prints out full pig latin name
	}
}
