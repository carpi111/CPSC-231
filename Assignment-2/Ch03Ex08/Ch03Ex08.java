/* Cryptarithmetic Puzzle */

// TYLER ANDREWS HELPED ME A LOT WITH THIS ONE

public class Ch03Ex08
{
	public static void main(String[] argv)
	{
		// PUZZLE:
		// TOO + TOO + TOO + TOO = GOOD

		int intT, intO, intG, intD; // EACH LETTER

		int intTooTotal intGoodTotal; // EACH WORD

		for(int d = 0; d <= 9; ++d)
		{
			intD = d;

			for(int g = 0; g <= 9; ++g)
			{
				intG = g;

				for(int o = 0; o <=9; ++o)
				{
					intO = o;

					for(int t = 0; t <= 9; ++t)
					{
						intT = t;

						intTooTotal = 4 * ((100 * intT) + (10 * intO) + intO); // CREATES 'TOO' WORD VALUE
						intGoodTotal = ((1000 * intG) + (100 * intO) + (10 * intO) + intD); // CREATES 'GOOD' WORD VALUE

						// DON'T CHECK FOR EQUALITY UNTIL EACH LETTER HAS BEEN ASSIGNED
						if( (intTooTotal == intGoodTotal) && (intT != intO) && (intT != intG) && (intT != intD) && (intO != intG) && (intO != intD) && (intG != intD) )
						{
							System.out.printf("\nPuzzle:\n\nTOO + TOO + TOO + TOO = GOOD\n\nSolution:\n\nT: %s%nO: %s%nG: %s%nD: %s%n%n", intT, intO, intG, intD);
						}
					}
				}
			}
		}
	}
}
