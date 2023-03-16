package mar16th;

public class Bank {
	
	private double balance=10000.00;
	
	public void setBalance(double deposit)
	{
		balance=balance+deposit;
	}
	
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
