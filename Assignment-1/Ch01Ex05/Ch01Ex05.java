public class Ch01Ex05
{
	public static void main(String[] argv)
	{
		String strSentence = "I hate programming in Java."; 							// original sentence with 'hate' in it

		int intHateIndex = strSentence.indexOf("hate"); 								// gets index of first occurence of 'hate'

		String strWordToChange = strSentence.substring(intHateIndex, intHateIndex + 4); // grabs entire word 'hate'

		strWordToChange = "love";


		System.out.println("\nThe sentence to be changed is:\n\n" + strSentence + "\n\n\nThe altered and correct sentence is:");
		System.out.println("\n" + strSentence.substring(0, intHateIndex) + strWordToChange + strSentence.substring(intHateIndex + 4));
		System.out.println("\n\n(The second sentence is the truth I promise.)\n");
	}
}
