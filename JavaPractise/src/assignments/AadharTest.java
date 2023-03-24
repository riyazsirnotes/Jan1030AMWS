package assignments;

public class AadharTest {

	public static void main(String[] args) {
		
		//user 1
		Aadhar a1= new Aadhar();
		a1.getAadhar("ABC123456A");
		
		
		//user 2
		
		Aadhar a2= new Aadhar();
		a2.getAadhar("ABC123456B","GB12346");
	}

}
