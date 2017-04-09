import java.util.Scanner;

public class Pizza
{
	private Scanner m_input = new Scanner(System.in);

	// MEMBER VARIABLES
	private int m_intSize;
	private int m_intCheese;
	private int m_intPepperoni;
	private int m_intHam;


	// DEFAULT CONSTRUCTOR
	public Pizza()
	{
		m_intSize = 0;
		m_intCheese = 0;
		m_intPepperoni = 0;
		m_intHam = 0;
	}

	// OVERLOADED CONSTRUCTOR
	public Pizza(int size, int cheese, int pepperoni, int ham)
	{
		m_intSize = size;
		m_intCheese = cheese;
		m_intPepperoni = pepperoni;
		m_intHam = ham;
	}


	// SETTER METHODS
	public void setSize(int size)
	{
		m_intSize = size;
	}

	public void setCheese(int cheese)
	{
		m_intCheese = cheese;
	}

	public void setPepperoni(int pepperoni)
	{
		m_intPepperoni = pepperoni;
	}

	public void setHam(int ham)
	{
		m_intHam = ham;
	}


	// CHECKS SIZE INPUT UNTIL VALID
	public void sizeCheck()
	{
		Boolean boolBadSize = true;
		int intSizeInput = 0;

		while(boolBadSize == true)
		{
			System.out.println("\nEnter pizza size:\n\n1 - Small\n2 - Medium\n3 - Large");
			intSizeInput = m_input.nextInt();

			switch(intSizeInput)
			{
				case 1:
				case 2:
				case 3:
					setSize(intSizeInput);
					boolBadSize = false;
					break;

				default:
					System.out.println("You entered an invalid size. Try again.");
			}
		}
	}


	public void makePizza()
	{
		System.out.println("\nEnter number of cheese toppings.");
		setCheese(m_input.nextInt());

		System.out.println("\nEnter number of pepperoni toppings.");
		setPepperoni(m_input.nextInt());

		System.out.println("\nEnter number of ham toppings.");
		setHam(m_input.nextInt());
	}


	// GETTER METHODS
	public int getSize()
	{
		return m_intSize;
	}

	public int getCheese()
	{
		return m_intCheese;
	}

	public int getPepperoni()
	{
		return m_intPepperoni;
	}

	public int getHam()
	{
		return m_intHam;
	}


	// CALCULATES COST OF PIZZA
	public double calcCost(int size, int cheese, int pepperoni, int ham)
	{
		double dblCost = 0.0;

		switch(size)
		{
			// SMALL
			case 1:
				dblCost = (10.0 + (2.0 * (cheese + pepperoni + ham)));
				break;

			// MEDIUM
			case 2:
				dblCost = (12.0 + (2.0 * (cheese + pepperoni + ham)));
				break;

			// LARGE
			case 3:
				dblCost = (14.0 + (2.0 * (cheese + pepperoni + ham)));
				break;
		}

		return dblCost;
	}


	// GETS PIZZA DESCRIPTION
	public String getDescription(int size, int cheese, int pepperoni, int ham)
	{
		String strDescript = null;

		switch(size)
		{
			case 1:
				strDescript = ("\nA small pizza with " + cheese + " cheese, " + pepperoni + " pepperoni, and " + ham + " ham toppings will cost $" + calcCost(size, cheese, pepperoni, ham) + "0.\n");
				break;

			case 2:
				strDescript = ("\nA medium pizza with " + cheese + " cheese, " + pepperoni + " pepperoni, and " + ham + " ham toppings will cost $" + calcCost(size, cheese, pepperoni, ham) + "0.\n");
				break;

			case 3:
				strDescript = ("\nA large pizza with " + cheese + " cheese, " + pepperoni + " pepperoni, and " + ham + " ham toppings will cost $" + calcCost(size, cheese, pepperoni, ham) + "0.\n");
				break;
		}

		return strDescript;
	}
}
