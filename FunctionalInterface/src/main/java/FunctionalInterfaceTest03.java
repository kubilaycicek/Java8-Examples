@FunctionalInterface
interface Sprint{
    /*
    * Bu metot java.lang.Object sınıfında yer aldığı için sayılmıyor ve functional interface yapısına uymuyor.
    * Anotasyon complie error verir..
    * */
    public boolean equals(Object o);

    // give abstract metotunu tanımlayarak functional interface yapmış olduk.
    public void give();

}
public class FunctionalInterfaceTest03 {
}