package may9th;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo5 {

	public static void main(String[] args) {
		
		
		Map<String, String> hMap=new HashMap<String, String>();
		
		hMap.put("Team Member", "John");
		
		hMap.put("Lead", "Sam");
		
		hMap.put("Manager", "Ravi");
		
		
		//using Iterator to retrive the value for each key
		
		Set<Entry<String, String>> allEntries=hMap.entrySet();
		
		Iterator<Entry<String, String>> it=allEntries.iterator();
		
		while(it.hasNext())
		{
			
			Entry<String, String> entry=it.next();
			
			
			System.out.println(entry.getKey()+"----"+entry.getValue());
			
			
		}
		
		
		//replace 
		
		hMap.put("Team Member", "Riyaz");
		hMap.put("Manager", "Riyaz");
		
		allEntries=hMap.entrySet();
		
		 it=allEntries.iterator();
		
		while(it.hasNext())
		{
			
			Entry<String, String> entry=it.next();
			
			
			System.out.println(entry.getKey()+"----"+entry.getValue());
			
			
		}

	}

}
