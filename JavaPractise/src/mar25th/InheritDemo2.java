package mar25th;

public class InheritDemo2 {

	public static void main(String[] args) {
		
			//user 1
		
			Sum obj1=new Sum();
			
			obj1.setX(10);
			obj1.setY(20);
			obj1.compute();
			
			//user 2
			
			Sub obj2=new Sub();
			
			obj2.setX(10);
			obj2.setY(20);
			obj2.compute();
			
			//user 3
			Mul obj3=new Mul();
			
			obj3.setX(10);
			obj3.setY(20);
			obj3.compute();
		
			//user 4
			
			Div obj4=new Div();	
			obj4.setX(10);
			obj4.setY(20);
			obj4.compute();

	}

}
