public class Ch01Ex03
{
	public static void main(String[] argv)
	{
		String strFirst = "vince";
		String strLast = "carpino";


		String strPigFirst = strFirst.substring(1,2).toUpperCase() + strFirst.substring(2) + strFirst.substring(0,1) + "ay"; // creates pig latin first name w/ capital first

		String strPigLast = strLast.substring(1,2).toUpperCase() + strLast.substring(2) + strLast.substring(0,1) + "ay"; 	 // creates pig latin last name w/ capital first

		System.out.println(strPigFirst + " " + strPigLast); 																 // prints out full pig latin name
	}
}
