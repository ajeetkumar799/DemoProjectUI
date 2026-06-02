package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> add = new HashMap<>();
		add.put("a", 12);
		add.put("b", 14);
		add.put(null,15);
		add.put(null,16);

		System.out.println(add.size());
		for(Map.Entry<String,Integer> aa: add.entrySet()) {
			System.out.println(aa.getKey());
			System.out.println(aa.getValue());
			
			
		}
		
	}

}
