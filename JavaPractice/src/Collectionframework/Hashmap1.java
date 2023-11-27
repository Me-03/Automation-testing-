package Collectionframework;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m2 = new HashMap<String, Integer>(); 
		m2.put("test", 100);
		m2.put("test2", 8068);
		
		System.out.println(m2);
		System.out.println(m2.size());
		
// other way to create a hash map 
		HashMap<Integer, String> m3 = new HashMap<Integer, String>(3);
		m3.put(100, "tannya");
		m3.put(806, "mannya");
		System.out.println(m3);
		System.out.println(m3.size());
		m3.put(100, "new");
		m3.put(900, "nestes");
		m3.put(600, "nestes");
		m3.put(689, "nestes");
		System.out.println(m3);
	}

}
