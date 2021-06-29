package com.company;

import java.util.List;

public class DayCare {
    public static void addAnimal(List<Animal> animalList, Animal animalType){  //Animal is the data type
        // animalList is the data type for list
        animalList.add(animalType);
    }

    public static void displayAnimals(List<Animal> animalList) {
        for (Animal animal : animalList)
            System.out.println(animal.getClass().getSimpleName() + "\n" + animal) ;
    }

    public static void displayAnimals(List<Animal> animalList, String animalType) {
        for (Animal animal : animalList) {
            if (animal.getClass().getSimpleName().equals(animalType)) {
                System.out.println(animal.getClass().getSimpleName());
                System.out.println(animal);
            }
        }
    }
    public static void removeAnimal(List<Animal> animalList, String name1){
        for(Animal animal : animalList) {
            if (animal.name.equals(name1)) {
                animalList.remove(animal);
                return;
            }
        }

    }

}
