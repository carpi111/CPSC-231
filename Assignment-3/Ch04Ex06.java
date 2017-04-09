/* Weighted Class Grade Calculator */

/* 3 QUIZZES @ 10 POINTS EACH, 1 MIDTERM @ 100 POINTS, 1 FINAL @ 100 POINTS */

/* 3 QUIZZES: 25% OF GRADE, 1 MIDTERM: 35% OF GRADE, 1 FINAL: 40% OF GRADE */

import java.util.Scanner;

public class Ch04Ex06
{
	public static void main(String[] argv)
	{
		Scanner input = new Scanner(System.in);
		Record record = new Record();

		System.out.println("\nEnter score for quiz #1. [0 - 10]");
		double dblQuizScore1 = input.nextDouble();

		System.out.println("\nEnter score for quiz #2. [0 - 10]");
		double dblQuizScore2 = input.nextDouble();

		System.out.println("\nEnter score for quiz #3. [0 - 10]");
		double dblQuizScore3 = input.nextDouble();

		System.out.println("\nEnter score for midterm. [0 - 100]");
		double dblMidtermGrade = input.nextDouble();

		System.out.println("\nEnter score for final. [0 - 100]");
		double dblFinalTestGrade = input.nextDouble();


		// CALCULATE OVERALL AND LETTER GRADE RECEIVED
		record.setOverallGrade(dblQuizScore1, dblQuizScore2, dblQuizScore3, dblMidtermGrade, dblFinalTestGrade);

		// PRINT OUT RECORD
		System.out.println(record.toString());
	}
}
