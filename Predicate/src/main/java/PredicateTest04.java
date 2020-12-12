import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest04 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Orange");
        myList.add("Banana");



        Predicate<String> predicate = (String item) -> item.startsWith("A");

        // Listedeki removeIf'e predicate'i set ederek A ile başlayanı çıkartıyoruz.
        myList.removeIf(predicate);

        myList.forEach(System.out::println);
    }
}
