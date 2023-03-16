package mar16th;

public class PersonDemo {

	public static void main(String[] args) {
		
		
		Person p1=new Person();
		
		System.out.println(p1.name); //null
		System.out.println(p1.age); //0
		System.out.println(p1.ph); //0
		
		p1.name="John";
		p1.age=30;
		p1.ph=9848022338l;
		
		System.out.println(p1.name); //John
		System.out.println(p1.age); //30
		System.out.println(p1.ph); // 9848022338
		p1.sleep();
		
		Person p2=new Person();
		
		System.out.println(p2.name); //null
		System.out.println(p2.age); //0
		System.out.println(p2.ph); //0
		
		p2.name="Balayya";
		p2.age=62;
		p2.ph=9606222333l;
		p2.eat();
		
		System.out.println(p2.name); 
		System.out.println(p2.age); 
		System.out.println(p2.ph); 
		

	}

}
