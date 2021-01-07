package com.kubilaycicek.generics02;

import java.util.ArrayList;
import java.util.List;

public class GenericExamples2 {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<Animal>();
        addElement(animalList);

        List<Dog> dogList = new ArrayList<Dog>();
        //addElement(dogList);

        Dog[] dogs = new Dog[3];
        addElementArray(dogs); //Cat IS-A Dog değil bu sebeple exception verir.

        addElementObject(dogList);

        List<Object> objectList = new ArrayList<>();
        addElementObject2(objectList);

    }

    public static void addElement(List<Animal> animalList) {
        animalList.add(new Dog());
        animalList.add(new Cat());
        animalList.add(new Animal());
    }

    public static void addElementArray(Animal[] animalList) {
        animalList[0] = new Cat();

    }

    // ? extends Object -> ? ayni anlama geliyor.
    public static void addElementObject(List<? extends Object> objects) {

    }

    //Buraya sadece List<Object> .
    public static void addElementObject2(List<Object> list) {

    }


}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}