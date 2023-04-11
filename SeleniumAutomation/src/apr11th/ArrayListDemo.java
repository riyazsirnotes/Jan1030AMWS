package apr11th;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30.33);
		al.add(40);
		al.add(50);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50.55);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

		System.out.println(al.contains(50.55));
	}

}
