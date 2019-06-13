package by.htp.les10.main;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> hMap = new HashMap<Integer, String>();
		
		hMap.put(1, "one");
		hMap.put(2,"two");
		hMap.put(3, "three");
		
		System.out.println(hMap);
		System.out.println(hMap.size());
		System.out.println(hMap.get(2));
		
		hMap.remove(2);
		System.out.println(hMap);
		
		hMap.put(2,"two");
		int counter = 0;
		for(Map.Entry<Integer, String> element: hMap.entrySet()) {
			counter++;
			System.out.println(element);
			
			
		}
		System.out.println(hMap);
		System.out.println("counter"+counter);
	}

}
