package com.kubilaycicek.nested06;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AnonymousTest {

    public static void main(String[] args) {
        Person person = new Person();
        person.printMessage();
        //

        Person anonimClass = new Person() {
            @Override
            public void printMessage() {
                System.out.println("Hello Anonymous Class !");
            }
        };
        anonimClass.printMessage();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Kubilay");
            }
        };

        System.out.println(person.getClass());
        System.out.println(anonimClass.getClass());

        //Anonim kullanım.
        MyInterface myInterface = new MyInterface() {

        };
    }
}

class Person {
    public void printMessage() {
        System.out.println("Hello message");
    }
}

interface MyInterface {

}
