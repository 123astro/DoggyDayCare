package com.company;

public class Dog extends Animal {
        public String breed;
        public int snoutLength;
        public int tailInInches;

        public Dog(String breed,int snoutLength, int tailInInches, int legs, int sizeInInches, boolean isFixed,
                   String name, double weight, String gender ){
        super(legs, sizeInInches, isFixed, name, weight, gender);
        this.breed = breed;
        this.snoutLength = snoutLength;
        this.tailInInches = tailInInches;
}
        public void speak() {
                System.out.println("Ruff");
        }

        public String toString() {
                return ("Breed: " + breed + "\nSnout Length: " + snoutLength +  "\nTail in Inches " +  tailInInches +
                        "\nNumber of legs: " +  legs + "\nsizeInInches: " + sizeInInches + "\nIs Fixed: " + isFixed +
                        "\nName " +
                        ": " + name  + "\nGender: " + gender + "\n");

        }
}
