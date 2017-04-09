import java.util.Scanner;

public class Ch02Ex04
{
	public static void main(String[] argv)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("\nLet's see how much it would cost you to drive somewhere.");

		System.out.print("\nEnter your distance travelled.\nMiles: ");
		double dblDist = input.nextDouble(); 												 // takes next input as a double

		System.out.print("\nEnter your vehicle's fuel consumption rating.\nMPG: ");
		double dblMPG = input.nextDouble();

		System.out.print("\nEnter the price for a gallon of gas.\n$");
		double dblPrice = input.nextDouble();

		double dblTotal = ((dblDist / dblMPG) * dblPrice); 									 // calculates the price of trip

		System.out.printf("\nThe price of your commute is about $%.2f" + ".\n\n", dblTotal); // formats final answer to show 2 decimal places
	}
}
