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

    }

    public static void addElement(List<Animal> animalList) {
        animalList.add(new Dog());
        animalList.add(new Cat());
        animalList.add(new Animal());
    }

    public static void addElementArray(Animal[] animalList) {
        animalList[0] = new Cat();

    }
}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}