
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateTest01 {
    public static void main(String[] args) {
        Predicate<String> predicate1 = element -> element.startsWith("k"); // Parametre tipi belirtmeden kullanım

        Predicate<Integer> predicate2 = (Integer number) -> number > 0; // Parametre tipini belirtmek istersek.

        Predicate<String> predicate3 = (String value) -> {
            return value.startsWith("k"); // Predicate Body kullanımı
        };

        // Predicateleri test etmek için test metotunu kullanırız.
        System.out.println(predicate2.test(2));

        // Streamler'de filter metotu predicate ile setlenir
        Stream.of("kubilay", "Java", "Spring").filter(predicate1).forEach(System.out::println);
    }
}
