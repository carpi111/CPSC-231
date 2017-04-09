public class Ch01Ex06
{
	public static void main(String[] argv)
	{
		int intGearSize = 100; 																	   // gear size is 100 inches
		int intCadence = 90; 																	   // cadence is 90 rpm
		double dblPi = 3.14;
		
		double dblSpeed = (intGearSize * dblPi * (1.0 / 12.0) * (1.0 / 5280.0) * intCadence * 60); // calculates speed of biker

		System.out.println("\nThe biker's speed is " + dblSpeed + " mph.\n");
	}
}
