package apr26th;

public class VargsDemo1 {

	public static void main(String[] args) {
		
		
		Sum obj1=new Sum();
		
		obj1.add(10, 20);
		
		obj1.add(10,20,30,40,50,60,70,80);
		
		obj1.add(10,20,30,40,50,60,70,80,10,20,30,40,50,60,70,80);

	}

}
