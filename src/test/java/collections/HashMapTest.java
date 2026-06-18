package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> add = new HashMap<>();
		add.put("a","apple");
		add.put("b","banana");
		add.put(null,"greaps");
		add.put(null,"ghhh");
		add.put("c",null);
		add.put("c",null);

		System.out.println(add.size());
		for(Map.Entry<String,String> aa: add.entrySet()) {
			System.out.print("Key "+aa.getKey()+" Value ="+aa.getValue());
			
		}
		
	}

}
