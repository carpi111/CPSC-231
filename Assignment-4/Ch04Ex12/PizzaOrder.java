import java.util.Scanner;

public class PizzaOrder
{
	// MEMBER VARIABLES
	private int m_intNumPizzas;

	private Scanner m_input = new Scanner(System.in);
	private Pizza m_pizza1 = new Pizza();
	private Pizza m_pizza2 = new Pizza();
	private Pizza m_pizza3 = new Pizza();


	// DEFAULT CONSTRUCTOR
	public PizzaOrder()
	{
		m_intNumPizzas = 0;
	}

	// OVERLOADED CONSTRUCTOR
	public PizzaOrder(int numPizzas)
	{
		m_intNumPizzas = numPizzas;
	}


	// SETTER METHODS
	public void setNumPizzas(int numPizzas)
	{
		m_intNumPizzas = numPizzas;
	}

	public void setPizza1(Pizza pizza1)
	{
		m_pizza1 = pizza1;
	}

	public void setPizza2(Pizza pizza2)
	{
		m_pizza2 = pizza2;
	}

	public void setPizza3(Pizza pizza3)
	{
		m_pizza3 = pizza3;
	}


	// CHECKS QUANTITY INPUT UNTIL VALID
	public int checkNumPizzas()
	{
		Boolean boolBadNum = true;
		int intNumInput = 0;

		while(boolBadNum == true)
		{
			System.out.println("How many pizzas would you like to order? [Max 3]");
			intNumInput = m_input.nextInt();

			switch(intNumInput)
			{
				case 1:
				case 2:
				case 3:
					setNumPizzas(intNumInput);
					boolBadNum = false;
					break;
				default:
					System.out.println("You entered an invalid quantity. Try again.");
			}
		}

		return m_intNumPizzas;
	}

	// TAKES ORDER BASED ON NUMBER OF PIZZAS
	public void takeOrder()
	{
		if(m_intNumPizzas == 1)
		{
			Pizza pizzaA = new Pizza();

			pizzaA.sizeCheck();
			pizzaA.makePizza();
			setPizza1(pizzaA);
		}

		else if(m_intNumPizzas == 2)
		{
			Pizza pizzaA = new Pizza();

			pizzaA.sizeCheck();
			pizzaA.makePizza();
			setPizza1(pizzaA);

			Pizza pizzaB = new Pizza();

			pizzaB.sizeCheck();
			pizzaB.makePizza();
			setPizza2(pizzaB);
		}

		else if(m_intNumPizzas == 3)
		{
			Pizza pizzaA = new Pizza();

			pizzaA.sizeCheck();
			pizzaA.makePizza();
			setPizza1(pizzaA);

			Pizza pizzaB = new Pizza();

			pizzaB.sizeCheck();
			pizzaB.makePizza();
			setPizza2(pizzaB);

			Pizza pizzaC = new Pizza();

			pizzaC.sizeCheck();
			pizzaC.makePizza();
			setPizza3(pizzaC);
		}
	}

	public double calcTotal()
	{
		return (m_pizza1.calcCost(m_pizza1.getSize(), m_pizza1.getCheese(), m_pizza1.getPepperoni(), m_pizza1.getHam()) // PIZZA 1 COST
				+ m_pizza2.calcCost(m_pizza2.getSize(), m_pizza2.getCheese(), m_pizza2.getPepperoni(), m_pizza2.getHam()) // PIZZA 2 COST
				+ m_pizza3.calcCost(m_pizza3.getSize(), m_pizza3.getCheese(), m_pizza3.getPepperoni(), m_pizza3.getHam())); // PIZZA 3 COST
	}

	public void printOrder()
	{
		System.out.println("Your total for this order will be $" + calcTotal() + "0.");
	}
}
