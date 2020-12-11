@FunctionalInterface
interface Car {
    void stop(Bmw bmw);
}


@FunctionalInterface
interface SubInterface extends Car {
    // Super Interface functional interface olduğu için FunctionalInterface'dir
    // İçerisine 1 adet abstract metot tanımlarsak compile error verir.
}

class Bmw {
}

public class FunctionalInterfaceTest02 {
}