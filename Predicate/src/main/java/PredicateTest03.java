import java.util.function.Predicate;

public class PredicateTest03 {
    public static void main(String[] args) {

        // Null ve Length Kontrolleri
        Predicate<String> nullCheckPredicate = (String item) -> item != null;
        Predicate<String> lengthCheckPredicate = (String item) -> item.length() > 1;

        // İki Predicate'i and ile birleştirebiliriz.
        Predicate<String> predicate1 = nullCheckPredicate.and(lengthCheckPredicate);


        String value = "Kubilay";
        String temp = null;

        // Testi le kontrol ettik
        System.out.println(predicate1.test(value));
        System.out.println(predicate1.test(temp));
    }
}
