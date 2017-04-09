public class Record
{
	// MEMBER VARIABLES
	private double m_quizGrade1; //
	private double m_quizGrade2; // THREE QUIZ GRADES
	private double m_quizGrade3; //

	private double m_midtermGrade;
	private double m_finalTestGrade;

	private double m_quizPercentAll;   //
	private double m_midtermPercent;   // TOTALS OF PERCENTAGES FOR EACH CATEGORY [DECIMALS]
	private double m_finalTestPercent; //

	private double m_overallGrade;
	private String m_letterGrade;


	// DEFAULT CONSTRUCTOR
	public Record()
	{
		m_quizGrade1 = 0.0;
		m_quizGrade2 = 0.0;
		m_quizGrade3 = 0.0;

		m_midtermGrade = 0.0;
		m_finalTestGrade = 0.0;

		m_quizPercentAll = 0.0;
		m_midtermPercent = 0.0;
		m_finalTestPercent = 0.0;

		m_overallGrade = 0.0;
		m_letterGrade = "an F.";
	}

	// OVERLOADED CONSTRUCTOR
	public void Record(double quiz1, double quiz2, double quiz3, double midterm, double fiinal, double quizPercentAll, double midtermPercent, double fiinalTestPercent, double overall, String letterGrade)
	{
		m_quizGrade1 = quiz1;
		m_quizGrade2 = quiz2;
		m_quizGrade3 = quiz3;

		m_midtermGrade = midterm;
		m_finalTestGrade = fiinal;

		m_quizPercentAll = quizPercentAll;
		m_midtermPercent = midtermPercent;
		m_finalTestPercent = fiinalTestPercent;

		m_overallGrade = overall;
		m_letterGrade = letterGrade;
	}


	// CALCULATES OVERALL GRADE RECEIVED
	public void setOverallGrade(double quiz1, double quiz2, double quiz3, double midterm, double fiinal)
	{
		m_quizGrade1 = quiz1; //
		m_quizGrade2 = quiz2; // POINTS RECEIVED ON EACH TEST
		m_quizGrade3 = quiz3; //

		// PERCENTAGE RECEIVED IN QUIZ CATEGORY [DECIMAL]
		m_quizPercentAll = (m_quizGrade1 + m_quizGrade2 + m_quizGrade3) / 30;

		// WEIGHT RECEIVED IN QUIZ CATEGORY
		m_quizPercentAll *= 25;


		// PERCENTAGE RECEIVED ON MIDTERM [DECIMAL]
		m_midtermGrade = midterm;
		m_midtermPercent = m_midtermGrade / 100;

		// WEIGHT RECEIVED IN MIDTERM CATEGORY
		m_midtermPercent *= 35;


		// PERCENTAGE RECEIVED ON FINAL [DECIMAL]
		m_finalTestGrade = fiinal;
		m_finalTestPercent = m_finalTestGrade / 100;

		// WEIGHT RECEIVED IN FINAL CATEGORY
		m_finalTestPercent *= 40;

		m_overallGrade = (m_quizPercentAll + m_midtermPercent + m_finalTestPercent);

		setLetterGrade(m_overallGrade);
	}

	// CALCULATES LETTER GRADE RECEIVED
	public void setLetterGrade(double grade)
	{
		if(grade >= 90)
		{
			m_letterGrade = "an A.";
		}

		else if(grade >= 80)
		{
			m_letterGrade = "a B.";
		}

		else if(grade >= 70)
		{
			m_letterGrade = "a C.";
		}

		else if(grade >= 60)
		{
			m_letterGrade = "a D.";
		}

		else
		{
			m_letterGrade = "an F.";
		}
	}

	// GETS OVERALL GRADE
	public double getOverallGrade()
	{
		return m_overallGrade;
	}

	// GETS OVERALL LETTER GRADE
	public String getLetterGrade()
	{
		return m_letterGrade;
	}


	public Boolean equals(Record r)
	{
		return ( (this.getOverallGrade() == r.getOverallGrade() ) && (this.getLetterGrade() == r.getLetterGrade()) );
	}

	public String toString()
	{
		return("\n\nQuiz #1: " + m_quizGrade1 + "  |  Quiz #2: " + m_quizGrade2 + "  |  Quiz #3: " + m_quizGrade3 + "  |  Midterm: " + m_midtermGrade + "  |  Final: " + m_finalTestGrade + "\n\nYou earned a total of " + (int)getOverallGrade() + " points in the class, which gets you " + getLetterGrade() + "\n");
	}
}
