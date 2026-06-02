package programs;
import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateCharactorFromString {
    public static void main(String[] args) {
        String input = "eeddss";  // Example string with digits
        ArrayList<Character> seen = new ArrayList<>();
        ArrayList<Character> duplicates = new ArrayList<>();

        for (char c : input.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                if (seen.contains(c)) {
                    if (!duplicates.contains(c)) {
                        duplicates.add(c);
                    }
                } else {
                    seen.add(c);
                }
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate numbers found.");
        } else {
            System.out.println("Duplicate numbers: " + duplicates);
        }

    }
}
