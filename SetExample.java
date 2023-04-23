import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> hs = new HashSet<>();
        hs.add("Dog");
        hs.add("Cat");
        hs.add("Elephant");
        hs.add("Lion");

        // Creating a LinkedHashSet
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Dog");
        lhs.add("Cat");
        lhs.add("Elephant");
        lhs.add("Lion");

        // Creating a TreeSet
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Dog");
        ts.add("Cat");
        ts.add("Elephant");
        ts.add("Lion");

        // HashSet - order not maintained
        System.out.println("HashSet: " + hs);
        // Console Output: HashSet: [Cat, Dog, Elephant, Lion] (could be any order)

        // LinkedHashSet - maintains insertion order
        System.out.println("LinkedHashSet: " + lhs);
        // Console Output: LinkedHashSet: [Dog, Cat, Elephant, Lion]

        // TreeSet - maintains natural order (alphabetical)
        System.out.println("TreeSet: " + ts);
        // Console Output: TreeSet: [Cat, Dog, Elephant, Lion]
    }
}
