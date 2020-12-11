//Bir interface'de bir tane metot varsa functional interface olur.
@FunctionalInterface
interface LambdaFunction {
    void message();
}

public class Lambda01Test {
    public static void main(String[] args) {

        //Örnek kullanım
        LambdaFunction lambdaFunction = () -> System.out.println("Hello World");

        lambdaFunction.message();
    }
}
