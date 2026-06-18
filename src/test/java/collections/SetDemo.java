package collections;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Spring");
        set.add("Java"); // duplicate ignored
        set.add(null);// prited
        set.add(null);// duplicate not printed
        System.out.println(set); // [Spring, Java] (order not guaranteed)
    }
}
