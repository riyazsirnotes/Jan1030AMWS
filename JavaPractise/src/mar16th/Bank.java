package mar16th;

public class Bank {
	
	private double balance=10000.00;
	
	//setters are some public methods where 
	// you can manipulate or modify the private varibales of the class
	public void setBalance(double deposit)
	{
		balance=balance+deposit;
	}
	
	//getters are some public methods where 
	// we can write code to retrieve private variable 
	//using some validation
	public double getBalance(int pin)
	{
		//validation to be done
		
		if(pin==3214)
		{
		return balance;
		}
		else 
		{
			System.out.println("Invalid Pin");
			return 0.0;
		}
		
	}

}
