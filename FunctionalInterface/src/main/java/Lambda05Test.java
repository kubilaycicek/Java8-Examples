@FunctionalInterface
interface LambdaFunctionV2 {
    String isOpen(boolean lock);
}


public class Lambda05Test {
    public static void main(String[] args) {
        LambdaFunctionV2 lambda01 = (boolean status) -> {
            if (status)
                return "Open";
            else
                return "Close";
        };

        LambdaFunctionV2 lambda02 = (boolean status) -> {
            if (status) return "Open";
            else return "Close";
        };


        System.out.println(lambda01.isOpen(true));
        System.out.println(lambda02.isOpen(false));
    }
}
