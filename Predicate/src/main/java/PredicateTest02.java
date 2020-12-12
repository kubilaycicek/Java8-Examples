import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateTest02 {
    public static void main(String[] args) {

        List<String> myList = Stream.of("kubilay", "çiçek", "java8").collect(Collectors.toList());
        // Stream to List

        // Predicate
        Predicate<String> predicate1 = item -> item.length() == 7;

        // Stream Predicate Test
        myList.stream().filter(predicate1).forEach(System.out::println);

    }
}
