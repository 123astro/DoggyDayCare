package com.company;

public class Dog extends Animal {
        public String breed;
        public int snoutLength;
        public int tailInInches;

        public Dog(String breed,int snoutLength, int tailInInches, int legs, int sizeInInches, boolean isFixed,
                   String name ){
        super(legs, sizeInInches, isFixed, name);
        this.breed = breed;
        this.snoutLength = snoutLength;
        this.tailInInches = tailInInches;
}
        public void speak() {
                System.out.println("Ruff");
        }
        public String toString() {
                return ("Breed: " + breed + ". Snout Length: " + snoutLength +  ". Tail in Inches " +  tailInInches +
                        ". Number of legs: " +  legs + ". sizeInInches: " + sizeInInches + ". Is Fixed: " + isFixed +
                        ". Name " +
                        ": " + name);

        }
}
