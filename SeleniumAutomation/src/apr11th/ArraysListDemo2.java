package apr11th;

import java.util.ArrayList;

public class ArraysListDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		//al.add("live  tech");
		al.add(40);
		al.add(50);
		
		//al.add(50.55);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		for(int temp:al)
		{
			System.out.println(temp);
		}

	}

}
