@FunctionalInterface
interface LambdaFunctionWithParameter {
    void message(String message);
}

public class Lambda02Test {

    public static void main(String[] args){
        //Parametre göndermek
        LambdaFunctionWithParameter lambda01 = message -> System.out.println("Message : " + message);

        //Parametre Tipini belirtmek
        LambdaFunctionWithParameter lambda02 = (String message) -> System.out.println("Message : " + message);

        //Body kullanmak
        LambdaFunctionWithParameter lambda03 = (String message) -> {
            System.out.println("Message : " + message);
        };

        lambda01.message("Hello");
    }
}
