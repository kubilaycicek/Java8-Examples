package com.kubilaycicek.nested06;

public class Notes {
    public static void main(String[] args) {
        Notes notes = new Notes();
        notes.createMyLocalClass();
    }

    // Method içerisinde class tanımlanabilir.
    public void createMyLocalClass() {
        //private String name =""; // private olamaz. Local Değişken
        String name = "test";

        // name = "test2"; // Variable 'name' is accessed from within inner class, needs to be final or effectively final
        class LocalInner {
            private void method() {
                System.out.println(name);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.method();
    }
}
