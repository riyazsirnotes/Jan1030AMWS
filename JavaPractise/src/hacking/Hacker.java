package hacking;

import mar16th.Bank;

public class Hacker {
	
	public static void main(String[] args) {
		
		Bank h1=new Bank();
		
		//System.out.println(h1.balance);
		
		System.out.println(h1.getBalance(1234));
	}

}
