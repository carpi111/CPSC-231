public class Ch01Ex01
{
	public static void main(String[] argv)
	{
		double dblWeightKilos = 150 / 2.2; 							 // converts pounds to kilos

		double dblCalsRun = 0.0175 * 10.0 * dblWeightKilos * 30.0;   // calculates calories burned during 30 minutes of running
		double dblCalsBall = 0.0175 * 8.0 * dblWeightKilos * 30.0;   // calculates calories burned during 30 minutes of basketball
		double dblCalsSleep = 0.0175 * 1.0 * dblWeightKilos * 360.0; // calculates calories burned during 6 hours of sleep
		int intTotal = (int)dblCalsRun + (int)dblCalsBall + (int)dblCalsSleep;

		System.out.println("\nTotal calories burned today: " + intTotal + "\n");
	}
}
