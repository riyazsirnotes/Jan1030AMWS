package may9th;

import java.util.HashMap;
import java.util.Map;

public class MapDemo4 {

	public static void main(String[] args) {
		
		
		Map<String, String> hMap=new HashMap<String, String>();
		
		hMap.put("Team Member", "John");
		
		hMap.put("Lead", "Sam");
		
		hMap.put("Manager", "Ravi");
		
		
		System.out.println(hMap.get("Manager"));
		
		

	}

}
