package apr11th;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("Selenium");
		hs.add("Qtp");
		hs.add("Appium");
		hs.add("Tosca");
		
		System.out.println(hs);
		
		for(String a:hs)
		{
			System.out.println(a);
		}
		
		

	}

}
