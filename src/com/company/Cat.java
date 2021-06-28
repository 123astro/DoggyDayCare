package com.company;

public class Cat extends Animal {
        public String furPattern;
        public boolean wasStray;
        public int weightInLbs;

        public Cat(String furPattern, boolean wasStray, int weightInLbs, int legs, int sizeInInches, boolean isFixed,
                   String name) {
                super(legs, sizeInInches, isFixed, name);
                this.furPattern = furPattern;
                this.wasStray = wasStray;
                this.weightInLbs = weightInLbs;
        }

        public void speak() {
                System.out.println("purr");
        }

        public String toString() {
                return ("Fur Pattern: " + furPattern + ". Was Stray: " + wasStray + ". Weight in Lbs: " + weightInLbs +
                        ". Number of legs: " + legs + ". Size In Inches: " + sizeInInches + ". Is Fixed: " + isFixed +
                        ". Name " +
                        ": " + name);

        }
}