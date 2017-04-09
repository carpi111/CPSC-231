/* The Game of Pig */

// THIS IS ESSENTIALLY TYLER ANDREWS' PROGRAM

import java.util.Random;
import java.util.Scanner;

public class Ch03Ex10
{
	public static void main(String[] argv)
	{
		Random randomGen = new Random();
		Scanner input = new Scanner(System.in);

		int intPlayerScore = 0;
		int intCompScore = 0;
		int intPlayerTurn = 0;
		int intCompTurn = 0;
		int intTurn = 1; // PLAYER'S TURN (COMPUTER IS 0)
		int intRandNum = 0;
		
		while(intPlayerScore < 100 && intCompScore < 100)
		{
			// PLAYER'S TURN
			if(intTurn == 1)
			{
				if(intPlayerTurn == 0)
				{
					System.out.println("\nIt's your turn. The score is  You: " + intPlayerScore + " | Computer: " + intCompScore);
				}

				intRandNum = (randomGen.nextInt(6) + 1);
				System.out.println("You rolled a " + intRandNum);
				
				if(intRandNum == 1)
				{
					System.out.println("Sorry, no points this turn.");
					intPlayerTurn = 0;
					intTurn = 0;
				}
				
				else if(intRandNum != 1)
				{
					intPlayerTurn += intRandNum;
					System.out.println("Your turn total is: " + intPlayerTurn);
					System.out.println("Would you like to roll again? (Type 1 to hold, or enter any other number to reroll)");
					int intHold = input.nextInt(); // COULDN'T GET 'h' TO WORK
					
					// IF PLAYER HOLDS
					if(intHold == 1)
					{
						intPlayerScore += intPlayerTurn; // ADD TURN TOTAL TO GAME TOTAL
						intTurn = 0; // COMPUTER'S TURN
						intPlayerTurn = 0; // RESET PLAYER TURN TOTAL
						System.out.println("Your game total is: " + intPlayerScore);
					}

					else
					{
						continue;
					}
				}
			}
			
			// COMPUTER'S TURN
			else if(intTurn == 0)
			{
				System.out.println("___________________________________________________________________\n");
				System.out.println("It's the computer's turn. The computer's current score is: " + intCompScore);
				
				while(intCompTurn < 20 && intTurn == 0)
				{
					intRandNum = (randomGen.nextInt(6) + 1);
					if(intRandNum == 1)
					{
						intTurn = 1; // PLAYER'S TURN
						intCompTurn = 0; // RESET COMPUTER TURN TOTAL
					}
					
					else if(intRandNum != 1)
					{
						intCompTurn += intRandNum;
						if(intCompTurn + intCompScore >= 100) // SKIPS TO COMPUTER WIN IF <20 POINTS NEEDED TO WIN
						{
							break;
						}
					}
				}

				intCompScore += intCompTurn; // ADD COMPUTER POINTS TO TOTAL
				intTurn = 1; // PLAYER'S TURN
				System.out.println("The computer scored " + intCompTurn + " points this turn.");
				System.out.println("The computer has scored " + intCompScore + " this game.");
				System.out.println("___________________________________________________________________");

				intCompTurn = 0; // RESET COMPUTER TURN TOTAL
			}
		}
		
		// IF PLAYER WINS
		if(intPlayerScore >= 100)
		{
	    	System.out.println("CONGRATULATIONS! YOU WIN! Your final score was " + intPlayerScore);
		}

		// IF COMPUTER WINS
		else if(intCompScore >= 100)
		{
	    	System.out.println("Sorry, you lost! The final score was  You: " + intPlayerScore + "Computer: " + intCompScore);
		}
	}
}
