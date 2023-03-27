package mar27th;

public class AbstractDemo {

	public static void main(String[] args) {
		
		//user 1
			Sum obj=new Sum();
			
			System.out.println(obj.compute(10, 20));
			
		//user 2
			
			Numbers obj2=new Sub();
			
			System.out.println(obj2.compute(10, 30));
		

	}

}
