public class Ch01Ex02
{
	public static void main(String[] argv)
	{
		int intInitialTicket = 157; 					 // initial amount of tickets earned

		int intTotalCandy = intInitialTicket / 10; 		 // calculates how many candy bars you can buy @ 10 tix per bar
		int intTotalGum = ((intInitialTicket % 10) / 3); // calculates how many gumballs you can buy with remaining tix @ 3 tix per gumball

		System.out.println("\nWith " + intInitialTicket + " tickets, you can buy " + intTotalCandy + " candy bars and " + intTotalGum + " gumballs together.\n");
	}
}
