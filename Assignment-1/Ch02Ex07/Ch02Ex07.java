import java.util.Scanner;

public class Ch02Ex07
{
	public static void main(String[] argv)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("\nThe items in the vending machine are priced in 5-cent increments from $0.25 to $1.00.\n");
		System.out.print("\nThe machine only accepts $1.00 bills.\n\nEnter the price of your item.\n$0.");
		double dblPrice = input.nextDouble();

		double dblChange = 100 - dblPrice; 			 	 // calculates how much change needs to be returned

		double dblQuarters = dblChange / 25; 			 // calculates number of quarters

		double dblDimes = (dblChange % 25) / 10; 		 // calculates number of dimes

		double dblNickels = ((dblChange % 25) % 10) / 5; // calculates number of nickels

		System.out.println("\nYour change for this item is $" + (dblChange / 100.0) + " and consists of " + (int)dblQuarters 
			+ " quarter(s), " + (int)dblDimes + " dime(s), and " + (int)dblNickels + " nickel(s).\n");
	}
}
