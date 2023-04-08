package apr8th;

public class ConditionStatements3 {

	public static void main(String[] args) {
		
		int salary=13500;
		
		if(salary>20000)
		{
			salary=salary+5000;
		}
		else if(salary > 10000 && salary < 20000)
		{
			salary=salary+2000;
		}
		else
		{
			salary=salary+1000;
		}
					
		System.out.println("Salary for this month "+salary);

	}

}
