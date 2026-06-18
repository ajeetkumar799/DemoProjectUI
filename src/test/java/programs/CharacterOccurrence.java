package programs;

import java.util.HashMap;
import java.util.Map;

class CharacterOccurrence {
	public static void main(String[] args) {
		// interview question
//        String input = "eeddss";
//        // Using HashMap to store character counts
//        Map<Character, Integer> charCountMap = new HashMap<>();
//
//        for (int i = 0; i < input.length(); i++) {
//            char c = input.charAt(i);
//
//            // If character already exists, increment count
//            if (charCountMap.containsKey(c)) {
//                charCountMap.put(c, charCountMap.get(c) + 1);
//            } else {
//                // Otherwise, add with count = 1
//                charCountMap.put(c, 1);
//            }
//        }
//
//        // Print occurrences
//        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
		// System.out.println("Character '" + entry.getKey() + "' occurs " +
		// entry.getValue() + " times.");
//        }

		String st = "Ajeet Kumarrrrr Singhhh";
		HashMap<Character,Integer>charCountMap = new HashMap<>();
		String str = st.replace(" ", "");
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c,charCountMap.get(c)+1);
			} else {
				charCountMap.put(c,1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry:charCountMap.entrySet()) {
			System.out.println("Character "+ entry.getKey()+ " Occures "+entry.getValue()+ " times");
		}
	}
}
