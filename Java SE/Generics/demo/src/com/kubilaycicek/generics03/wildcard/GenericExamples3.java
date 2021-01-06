package com.kubilaycicek.generics03.wildcard;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class GenericExamples3 {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<Animal>();

        addElementGenericRule(animalList);

        List<Cat> catList = new ArrayList<Cat>();
        List<Dog> dogList = new ArrayList<Dog>();
        List<Kangal> kangalList = new ArrayList<Kangal>();
        List<Object> objectList = new ArrayList<Object>();


        addElementWildCard(dogList);
        addElementWildCard(catList);
        addElementWildCard(animalList);

        //
        addElementWildCardSuper(dogList);
        //addElementWildCardSuper(catList); //compile error
        addElementWildCardSuper(animalList);
        ///addElementWildCardSuper(kangalList);//compile error
        addElementWildCardSuper(objectList);


        dogList.add(new Dog());
        //dogList.add(new Animal()); // Animal IS-A dog değil !
    }

    public static void addElementGenericRule(List<Animal> animals) {

    }

    public static void addElementWildCard(List<? extends Animal> animals) {
        // ? wildcard ile extends kullanıldığında burada eleman eklemeye izin vermez !
        //animals.add(new Cat());
        //animals.add(new Dog());
        animals.add(null);
    }

    // ? superDog -> Dog ya da superi olması gerekir.!
    public static void addElementWildCardSuper(List<? super Dog> dogs) {
        dogs.add(new Kangal());
        dogs.add(new Dog());
        //dogs.add(new Animal()); Animal IS-A Animal değil !
    }
}

interface SuperAnimal {
}

class Animal {
}

class Dog extends Animal implements SuperAnimal {
}

class Cat extends Animal {
}

class Kangal extends Dog {
}