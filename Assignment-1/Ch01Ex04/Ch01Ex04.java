public class Ch01Ex04
{
	public static void main(String[] argv)
	{
		int intGoalWeight = 150; 	   // friend's goal weight
		double dblMouseWeight = 2.0;   // mouse's weight
		double dblToKillMouse = 0.006; // percent of sweetener to kill a mouse
		double dblSweetCnst = 0.001;   // percent of sweetner in  1 soda

		System.out.println("Congratulations. You can drink up to " + (((dblToKillMouse / dblMouseWeight) / dblSweetCnst) * intGoalWeight) + " sodas without dying.");
	}
}
