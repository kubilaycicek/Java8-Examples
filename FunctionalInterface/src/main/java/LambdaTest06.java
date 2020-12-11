@FunctionalInterface
interface LambdaFinal {
    void printMessage(String message);
}

public class LambdaTest06 {
    public static void main(String[] args) {
        String value1 = "Kubilay";
        String value2 = "Çiçek";

        LambdaFinal lambda01 = message -> System.out.println(message + ". " + value1 + " " + value2);
        lambda01.printMessage("Hello ");
    }
}