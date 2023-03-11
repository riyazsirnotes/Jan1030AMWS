package mar11th;

public class VariablesDemo2 {
	
	int y;
	
	char c=98;

   boolean b;
   
   String s;
   
   float z=0.12F;
   
	public static void main(String[] args) {
		
		//create an instance or object
		//syntax 
		//ClassName objectName=new ClassName();
		//calling style 
		// objectName.varibaleName
		
		VariablesDemo2 obj=new VariablesDemo2();
		
		System.out.println(obj.y);
		
		System.out.println(obj.b);
		
		System.out.println(obj.c);
		
		System.out.println(obj.z);

	}

}
