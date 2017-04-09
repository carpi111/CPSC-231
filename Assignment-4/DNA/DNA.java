/* DNA Sequence & Compliment */

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;

public class DNA
{
	public static void reverseCompliment(String file1, String file2)
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file1));
			PrintWriter pw = new PrintWriter(new FileOutputStream(file2));

			String first = null;
			String second = null;
			String compliment = null;

			while( (first = br.readLine()) != null )
			{
				second += first;
			}

			br.close();

			System.out.println("\nThe original sequence is:");

			for(int i = 0; i < second.length(); ++i)
			{
				if(second.charAt(i) == 'A')
				{
					pw.print("A");
					System.out.print("A");
				}

				else if(second.charAt(i) == 'T')
				{
					pw.print("T");
					System.out.print("T");
				}

				else if(second.charAt(i) == 'C')
				{
					pw.print("C");
					System.out.print("C");
				}

				else if(second.charAt(i) == 'G')
				{
					pw.print("G");
					System.out.print("G");
				}
			}

			pw.println();
			System.out.println("\n\nThe compliment is:");

			for(int i = 0; i < second.length(); ++i)
			{
				if(second.charAt(i) == 'A')
				{
					pw.print("T");
					System.out.print("T");
				}

				else if(second.charAt(i) == 'T')
				{
					pw.print("A");
					System.out.print("A");
				}

				else if(second.charAt(i) == 'C')
				{
					pw.print("G");
					System.out.print("G");
				}

				else if(second.charAt(i) == 'G')
				{
					pw.print("C");
					System.out.print("C");
				}
			}

			pw.close();
			System.out.println();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
