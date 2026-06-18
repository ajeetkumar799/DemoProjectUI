package collections;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // Create a Vector of Strings
        Vector<String> vector = new Vector<>();

        // Add elements
        vector.add("Java");
        vector.add("Selenium");
        vector.add("SQL");
        vector.add("Git");

        // Display the Vector
        System.out.println("Vector elements: " + vector);

        // Access element by index
        System.out.println("Element at index 2: " + vector.get(2)); // SQL

        // Remove an element
        vector.remove("Git");
        System.out.println("After removal: " + vector);

        // Iterate using for-each loop
        for (String item : vector) {
            System.out.println(item);
        }

        // Check if element exists
        if (vector.contains("Java")) {
            System.out.println("Vector contains Java");
        }
    }
}
