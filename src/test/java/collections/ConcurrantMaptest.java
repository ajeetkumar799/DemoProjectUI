package collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrantMaptest {
	public static void main(String[] args) {
//		❌ Null keys/values not allowed
//		✅ Thread-safe operations
//		✅ Better than Hashtable for concurrency
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("A", 1);
        map.put("B", 2);

        // Retrieve
        System.out.println("Value of A: " + map.get("A"));

        // Remove
        map.remove("B");

        System.out.println("Final Map: " + map);
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
	}
}
