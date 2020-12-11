@FunctionalInterface
interface LambdaFunctionWithMoreParameters {
    void addition(int number1, int number2);
}

class LambdaTest03 {
    public static void main(String[] args) {
        //Parametreli kullanım
        LambdaFunctionWithMoreParameters lambda01 = ((number1, number2) -> System.out.println("Result : " + (number1 + number2)));

        //Parametrelerin tipini belirtmek
        LambdaFunctionWithMoreParameters lambda02 = (int number1, int number2) -> System.out.println("Result " + (number1 + number2));

        //Body kullanmak
        LambdaFunctionWithMoreParameters lambda03 = (int number1, int number2) -> {
            System.out.println("Result : " + (number1 + number2));
        };


        lambda02.addition(100, 101);
    }
}