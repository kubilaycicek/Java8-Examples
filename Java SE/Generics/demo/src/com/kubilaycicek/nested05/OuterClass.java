package com.kubilaycicek.nested05;

public class OuterClass {

    // outer class -> inner clas in private üyelerine erişim sağlayabilir.
    // inner class -> outer class in private üyelerine erişim sağlayabilir.
    private String name = "testuser";

    private class RegularInnerClass {

        private String password = "12345";
        private static String compilerError="test"; // static değişken tanımlanamaz.

        private void printMessage() {
            System.out.println(name);//private üyelere erişim sağlayabilir
        }
    }

    private static String staticName = "static user";

    protected static class StaticNestedClass {
        private String name = "test";
        private static String staticName = "test2";
        //static nested calssta static değişken tanımlanabilir.
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.new RegularInnerClass();

        OuterClass.RegularInnerClass inner2 = new OuterClass().new RegularInnerClass();

        System.out.println(outerClass.name);

        System.out.println(staticName);
    }

    public void createInnerObject() {
        RegularInnerClass regularInnerClass = new RegularInnerClass();
        System.out.println(regularInnerClass.password);
    }
}
