import java.util.function.Predicate;

public class PredicateTest05 {

    public static void main(String[] args) {

        Predicate<String> predicate1 = String::isEmpty;

        String value1 = "";
        String value2 ="Java8";

        System.out.println(predicate1.test(value2));
        System.out.println(predicate1.test(value1));
    }
}
