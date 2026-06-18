package collections;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add(null); // duplicate allowed
        list.add(null);
        list.add(null); //
        System.out.println(list); // [Java, Spring, Java]
    }
}
