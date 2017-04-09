import java.util.Scanner;

public class Ch02Ex08
{
	public static void main(String[] argv)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("\nEnter a sentence.");
		String strSentence = input.nextLine();

		System.out.println("\nYour sentence in all uppercase is \"" + strSentence.toUpperCase() + "\".");
		System.out.println("\nYour sentence in all lowercase is \"" + strSentence.toLowerCase() + "\".\n");
	}
}
