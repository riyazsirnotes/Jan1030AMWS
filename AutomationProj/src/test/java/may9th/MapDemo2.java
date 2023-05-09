package may9th;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapDemo2 {

	public static void main(String[] args) {
		
		
		Map<String, String> hMap=new HashMap<String, String>();
		
		hMap.put("Team Member", "John");
		
		hMap.put("Lead", "Sam");
		
		hMap.put("Maanager", "Ravi");
		
		System.out.println(hMap);
		
		Set<Entry<String, String>> allEntries=hMap.entrySet();
		
		//using for-each
		
		for(Entry<String, String>  entry:allEntries)
		{
			System.out.println(entry.getKey()+"------"+entry.getValue());
		}

	}

}
