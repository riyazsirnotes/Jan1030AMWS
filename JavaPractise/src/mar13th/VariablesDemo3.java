package mar13th;

public class VariablesDemo3 {
	String studentName="Yaswant";
	int rollNo=1;
	String courseName="Selenium";
	static String institueName="Live Tech";
	
	public static void main(String[] args) {
		
		//System.out.println(VariablesDemo3.institueName);
		
		// Object 1 for Student 1
		
		int x=30;
		
		VariablesDemo3 s1=new VariablesDemo3();
		
		System.out.println(s1.studentName);
		System.out.println(s1.rollNo);
		System.out.println(s1.courseName);
		System.out.println(VariablesDemo3.institueName);
		
		System.out.println(x);
		
	}

}
