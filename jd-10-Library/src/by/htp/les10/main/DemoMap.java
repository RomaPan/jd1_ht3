package by.htp.les10.main;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
	
	
	public static void main (String[] args) {
		
		Map<String, String> maps = new HashMap<String, String>();
		
		maps.put("1","one");
		maps.put("2","two");
		maps.put("3","three");
		
		System.out.println(maps.get("3"));
	}

}
