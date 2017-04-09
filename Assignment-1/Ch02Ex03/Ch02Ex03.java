import java.util.Scanner;

public class Ch02Ex03
{
	public static void main(String[] argv)
	{
		Scanner input = new Scanner(System.in); // creates'input' object of type 'Scanner'

		System.out.println("\nEnter number one:");
		int intNum1 = input.nextInt(); 			// takes in next input as int

		System.out.println("\nEnter number two:");
		int intNum2 = input.nextInt(); 			// takes in next input as int

		System.out.println("\nTheir sum is " + (intNum1 + intNum2) + ", their difference is " + (intNum1 - intNum2) + ", and their product is " + (intNum1 * intNum2) + ".\n");
	}
}
