package collections;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Selenium");
        list.add("SQL");

        System.out.println("LinkedList: " + list);
        list.addFirst("Git"); // Fast insertion at beginning
        System.out.println("After addFirst: " + list);
    }
}
