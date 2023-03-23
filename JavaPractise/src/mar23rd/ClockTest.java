package mar23rd;

public class ClockTest {

	public static void main(String[] args) {
		
		//user 1
		
		Clock c1=new Clock();
		c1.getClock();
		
		// User 2
		
		Clock c2=new Clock(11);
		c2.getClock();
		
		//User 3
		
		Clock c3=new Clock(11,26);
		c3.getClock();
		
		//User 4
		
		Clock c4=new Clock(11,26,55);
		c4.getClock();
		

	}

}
