package assignments;

public class Aadhar {
	
	
	public void getAadhar(String panNo) 
	{
		printAadhar();
	}
	public void getAadhar(String panNo,String passNo) 
	{
		printAadhar();
	}
	public void getAadhar(String panNo,String passNo,String dLNo) 
	{
		printAadhar();
	}

	private void printAadhar() {
		
		System.out.print((int)(Math.random()*10000));
		System.out.print(" "+(int)(Math.random()*10000));
		System.out.print(" "+(int)(Math.random()*10000));
		System.out.println();
		
	}

}
