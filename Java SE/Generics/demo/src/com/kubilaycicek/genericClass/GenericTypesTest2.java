package com.kubilaycicek.genericClass;

public class GenericTypesTest2 {

    //Metot static ise mutlaka  public static <T> void bu şekilde tanımlanmalı !
    public static <T> void genericMethod(T[] array) { //T tipinde array
        for (T element : array) {
            System.out.println(element + "");
        }
    }

    public static void main(String[] args) {
        Integer[] i = {1, 2, 3, 4, 5, 6};
        Double[] d = {1.5, 2.3, 4.5, 6.7};
        Boolean[] b = {true, false, true};

        genericMethod(i);   ///Integer
        genericMethod(d);   /// Double
        genericMethod(b);   ///Boolean
    }
}
