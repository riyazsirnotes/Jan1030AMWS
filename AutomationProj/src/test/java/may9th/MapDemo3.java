package may9th;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo3 {

	public static void main(String[] args) {
		
		
		Map<Integer, String> hMap=new HashMap<Integer, String>();
		
		hMap.put(100, "John");
		
		hMap.put(101, "Sam");
		
		hMap.put(102, "Ravi");
		
		Set<Entry<Integer, String>> allEntries=hMap.entrySet();
		
		//using for-each
		
		for(Entry<Integer, String>  entry:allEntries)
		{
			System.out.println(entry.getKey()+"------"+entry.getValue());
		}
		
		

	}

}
