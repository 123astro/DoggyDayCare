package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleBinaryOperator;

public class Main {

    public static List<Animal> DoggyDayCare = new ArrayList<>();
    public static void main(String[] args) {
        addAnimal(DoggyDayCare, new Cat("solid orange", true, true, 4, 60, true, "Sam", 8, "female"));
        addAnimal(DoggyDayCare, new Dog("greyhound", 10, 15, 4, 60, true, "Jon", 10.4, "male"));
        addAnimal(DoggyDayCare, new Dog("shepard", 8, 7, 4, 49, true, "Bob", 80, "male"));
        displayAnimals(DoggyDayCare);
        System.out.println("\nremove Bob\n");
        removeAnimal(DoggyDayCare,"Bob");



    }

        public static void addAnimal(List<Animal> animalList, Animal animalType){  //Animal is the data type
        animalList.add(animalType);
    }

        public static void displayAnimals(List<Animal> animalList) {
        for (Animal animal : animalList)
            System.out.println(animal);
    }

        public static void displayAnimals(List<Animal> animalList, String animalType) {
        for (Animal animal : animalList) {
            if (animal.getClass().getSimpleName().equals(animalType)) {
                System.out.println(animalType);
                System.out.println(animal);
            }
        }
    }
        public static void removeAnimal(List<Animal> animalList, String name){
        for(Animal animal : animalList) {
            if (animal.name.equals(name)) {
                animalList.remove(animal);
                displayAnimals(DoggyDayCare);
                return;
            }
        }
    }
}



//    Warm up review of the previous work with a test on Github. Submit the github link to your repo for this
//    assignment. if you are unable to do that we will review github in class today to make sure everyone is
//    able to submit a github link.
//
//
//        Today you will create a Doggy Daycare application that can handle both Dogs and Cats . create the
//        following classes:
//
//        Animal Class:
//        Field requirements: legs, size, isFixed, name
//        include 1 field of your own creation
//        Construction that takes at least the four required fields and initializes them.
//        A speak method that outputs ("---")
//
//
//        Dog Class, Child class of Animal,
//        Field requirements: Breed, snoutLength,
//        include 1 field of your own creation.
//        Constructor that takes at least the required fields and satisfies the parent constructor.
//        Override speak class
//
//
//         Cat Class Child class of Animal,
//        Field requirements: Pattern, wasStray
//        include 1 field of your own creation,
//        Constructor that takes at least the required fields and satisfies the parent constructor.
//        Override speak Class
//
//
//        (additional challenge. Create a noise field in either child class, update the speak class. if the animal's
//        noise field has data speak the noise otherwise use the parent speak method, hint: may need a
//        second constructor)
//
//
//        DayCare class
//
//
//        static method addAnimal takes an Animal and an Animal List. The method should add the animal to the list.
//        Static method displayAnimals should take an Animal List and should print out each Animal. (note that
//        this is going to print out Animal details)
//        Update the displayAnimals class where as it iterates through each animal it tests what child class it is
//        and prints differently depending on the Animals child type.
//        Static Method removeAnimal should take a name and an Animal list. The method should go through and find
//        the animal with the same name then remove that animal from the list.
//
//
//        Tips to run this program.
//        You'll instantiate the Animal list in the Main method.
//        when you add an animal you can run the method as addAnimal(animalList, new Dog(...parameters...))