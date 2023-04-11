package apr11th;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("Selenium");
		hs.add("Qtp");
		hs.add("Appium");
		hs.add("Tosca");
		
		Iterator<String> it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
