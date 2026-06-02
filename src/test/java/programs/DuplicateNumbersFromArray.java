package programs;
import java.util.HashMap;
import java.util.Map;

public class DuplicateNumbersFromArray {
    public static void main(String[] args) {
        int arr []= {1,2,2,3,3,4,5,6,6,6,7};

        // Use a HashMap to store frequency of each number
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Print duplicates
        boolean hasDuplicate = false;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Number " + entry.getKey() + " repeats " + entry.getValue() + " times");
                hasDuplicate = true;
            }
        }

        if (!hasDuplicate) {
            System.out.println("No duplicate numbers found.");
        }
    }
}
