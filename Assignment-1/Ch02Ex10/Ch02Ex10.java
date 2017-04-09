import java.util.Scanner;

public class Ch02Ex10
{
	public static void main(String[] argv)
	{
		Scanner input = new Scanner(System.in);

		String[] strNames = new String[3]; 								// {
		int[] intQuants = new int[3]; 									//     declare arrays for product names, quantities, and prices
		double[] dblPrices = new double[3]; 							// }

		for(int i = 0; i < 3; i++) 										// {
		{
			System.out.println("\nName of item " + (i + 1) + ":");
			strNames[i] = input.nextLine();
		}

		for(int i = 0; i < 3; i++) 										//     fills arrays with product names, quantities, and prices
		{
			System.out.println("\nHow many of item " + (i + 1) + "?");
			intQuants[i] = input.nextInt();
		}

		for(int i = 0; i < 3; i++) 										// }
		{
			System.out.print("\nPrice of item " + (i + 1) + ":\n$");
			dblPrices[i] = input.nextDouble();
		}

		double dblSubtotal = ((intQuants[0] * dblPrices[0]) + (intQuants[1] * dblPrices[1]) + (intQuants[2] * dblPrices[2]));
		double dblTax = (dblSubtotal * 0.0625);
		double dblTotal = dblSubtotal + dblTax;

		System.out.println("\nYour bill:\n"); 																						   // {

		System.out.printf("%-30s %-10s %-10s %-10s%n", "Item", "Quantity", "Price", "Total"); 										   //     formats output
		System.out.printf("%-30s %-10s $%-9.2f $%-10.2f%n", strNames[0], intQuants[0], dblPrices[0], (intQuants[0] * dblPrices[0]));   //     to
		System.out.printf("%-30s %-10s $%-9.2f $%-10.2f%n", strNames[1], intQuants[1], dblPrices[1], (intQuants[1] * dblPrices[1]));   //     appear
		System.out.printf("%-30s %-10s $%-9.2f $%-10.2f%n%n", strNames[2], intQuants[2], dblPrices[2], (intQuants[2] * dblPrices[2])); //     in
		
		System.out.printf("%-30s %-10s %-10s $%-10.2f%n", "Subtotal", "", "", dblSubtotal); 										   //     nicely
		System.out.printf("%-30s %-10s %-10s $%-10.2f%n", "6.25% sales tax", "", "", dblTax); 										   //     printed columns
		System.out.printf("%-30s %-10s %-10s $%-10.2f%n%n", "Total", "", "", dblTotal); 											   // }
	}
}
