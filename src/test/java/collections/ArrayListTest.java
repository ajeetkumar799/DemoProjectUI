package collections;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(12);
		int a = numbers.size();
		// System.out.println(a);

		// Fetch
		// System.out.println(numbers.get(0));
		// remove
//		numbers.remove(0);
//		for (int i=0;i<numbers.size();i++) {
//			System.out.print(numbers.get(i)+",");
//		}
//		
		for (Integer a2 : numbers) {
			System.out.println(a2);

		}
	}

}
