/* Exponential Sum */

// THIS IS ESSENTIALLY TYLER ANDREWS' PROGRAM
// WE COULDN'T GET IT TO WORK PROPERLY

import java.util.Scanner;

public class Ch03Ex07
{
	public static void main(String[] argv)
	{
		Scanner input = new Scanner(System.in);

		double dblExponent = 0.0;
		double dblFactorial = 1;
		double dblAnswer = 0;	
	
		while(true)
		{			
			System.out.println("Enter a number 'x' to calculate the value of e^x.");
			dblExponent = input.nextDouble();
			
			for(int n = 1; n <= 10; ++n)
			{
				for(int i = 0; i < n; ++i)
				{
					for(int j = 1; j <= i; ++j)
					{
						dblFactorial *= j;
					}				
					
					dblAnswer += ((dblExponent * i) / (dblFactorial));
				}				
				
				System.out.println("For n = " + n + " e^x = " + dblAnswer);
			}
			
			int n = 50;
			for(int i = 0; i < n; ++i)
				{
					for(int j = 1; j <= i; ++j)
					{
						dblFactorial *= j;
					}				
					
					dblAnswer += ((dblExponent * i) / (dblFactorial));
				}
			System.out.println("For n = 50, e^x = " + dblAnswer);
				
			
			n = 100;
			for(int i = 0; i < n; ++i)
				{
					for(int j = 1; j <= i; ++j)
					{
						dblFactorial *= j;
					}				
					
					dblAnswer += ((dblExponent * i) / (dblFactorial));	
				}	
			System.out.println("For n = 100, e^x = " + dblAnswer);
				
			
			System.out.println("To exit, enter 1. To calulcate again, enter any other number.)");
			int intResponse = input.nextInt();
			if(intResponse == 1)
			{
				break;
			}

			else
			{
				continue;
			}
		}
	}
}
