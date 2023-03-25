package mar25tha;

public class InheritDemo3 {

	public static void main(String[] args) {
		
		
		//case 1
		
		P obj1=new P();
		obj1.m1();   //This is P's m1 method
		System.out.println(obj1.x);  //10
		
		//case 2
		
		C obj2=new C();
		obj2.m1(); //This is C's m1 method 
		System.out.println(obj2.x);  // 20
		
		//case 3
		
		P obj3=new C();
		obj3.m1(); //This is C's m1 method
		System.out.println(obj3.x); // 10 
		
		// case 4
		
		//C obj4=new P();  ==> not valid
		
		

	}

}
