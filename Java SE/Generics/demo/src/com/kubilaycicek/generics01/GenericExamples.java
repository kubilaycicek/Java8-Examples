package com.kubilaycicek.generics01;

public class GenericExamples {
    public static void main(String[] args) {
        Animal animalDog = new Dog();
        //List<Animal> animalDogList = new ArrayList<Dog>(); Compiler Errors
        //animalDogList.add(new Dog());
        //animalDogList.add(new Cat());
        //Dog IS-A Animal
        // ArrayList IS-A list olsa da bu şekilde kullanmak legal değildir. Compiler error.

        Animal[] animalDogArray = new Dog[5];
        animalDogArray[0] = new Dog();
        animalDogArray[1] = new Cat(); // ArrayStore Exception
        //Cat IS-A dog olmadığı için runtime' da exception alırız.
    }
}

class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}