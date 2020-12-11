
@FunctionalInterface
interface LambdaCalculator {
    int process(int number1, int number2);
}

public class Lambda04Test {
    public static void main(String[] args) {

        // Sonucu return eder.
        LambdaCalculator lambda01 = (number1, number2) -> number1 + number2;
        // Parametre tiplerini belli etmek
        LambdaCalculator lambda02 = (int number1, int number2) -> number1 - number2;

        // Sonucu açık bir şekilde return etmek.
        LambdaCalculator lambda03 = (int number1, int number2) -> {
            return number1 + number2;
        };

        System.out.println(lambda01.process(10, 12));
        System.out.println(lambda02.process(9, 3));
        System.out.println(lambda03.process(5, 5));
    }
}
