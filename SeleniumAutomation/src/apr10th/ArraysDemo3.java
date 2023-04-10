package apr10th;

public class ArraysDemo3 {

	public static void main(String[] args) {
		
		String[][] data=new String[4][2];
		
		data[0][0]="reyaz0617";
		data[0][1]="reyaz123";
		
		data[1][0]="reyaz0617";
		data[1][1]="reyaz456";
		
		data[2][0]="reyaz1212";
		data[2][1]="reyaz123";
		
		data[3][0]="reyaz1212";
		data[3][1]="reyaz456";
		
		for(int i=0;i<data.length;i++)
		{
			
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j]+"   ");
			}
			
			System.out.println();
		}
		

	}

}
