import java.util.Scanner;

public class Ch02Ex05
{
	public static void main(String[] argv)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("\nEnter the purchase price of your item.\n$");
		float fltPrice = input.nextFloat(); 					  // takes in next input as a float

		System.out.print("\nEnter the salvage value of your item.\n$");
		float fltSalvage = input.nextFloat();

		System.out.println("\nEnter the number of years your item has been used.");
		float fltYears = input.nextFloat();

		float fltDepreciate = (fltPrice - fltSalvage) / fltYears; // calculates the yearly depreciation of the item

		System.out.printf("\nThe yearly depreciation for your item is $%.2f.\n\n", fltDepreciate);
	}
}
