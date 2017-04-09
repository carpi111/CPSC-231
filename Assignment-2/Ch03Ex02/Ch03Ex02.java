/* The Game of Craps */

import java.util.Random;

public class Ch03Ex02
{
	public static void main(String[] argv)
	{
		Random randomGen = new Random();

		int intRoll01, intRoll02, intRoll03, intRoll04;

		int intRollTotal, intNewTotal, intPoint;

		double dblWins = 0.0;
		double dblLosses = 0.0;

		for(int i = 0; i < 10000; ++i)
		{
			// COME OUT ROLL
			intRoll01 = randomGen.nextInt(6) + 1;
			intRoll02 = randomGen.nextInt(6) + 1;
			intRollTotal = intRoll01 + intRoll02;

			switch(intRollTotal)
			{
				case 7:
				case 11:
					++dblWins;
					break;

				case 2:
				case 3:
				case 12:
					++dblLosses;
					break;

				default:
					// SET THE POINT VALUE AND ROLL AGAIN
					intPoint = intRollTotal;
					intRoll03 = randomGen.nextInt(6) + 1;
					intRoll04 = randomGen.nextInt(6) + 1;
					intNewTotal = intRoll03 + intRoll04;

					// KEEP ROLLING UNTIL '7' OR 'POINT' IS ROLLED
					while(intNewTotal != 7 && intNewTotal != intPoint)
					{
						intRoll03 = randomGen.nextInt(6) + 1;
						intRoll04 = randomGen.nextInt(6) + 1;
						intNewTotal = intRoll03 + intRoll04;
					}

					if(intNewTotal == 7)
					{
						++dblLosses;
					}

					else if(intNewTotal == intPoint)
					{
						++dblWins;
					}

					break;
			}
		}

		double dblProb = (dblWins / (dblWins + dblLosses)) * 100.0;
		System.out.printf("\nYou have a %.2f%% chance of winning Craps at this casino.%n%n", dblProb);
	}
}
