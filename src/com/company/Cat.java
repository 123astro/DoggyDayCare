package com.company;

public class Cat extends Animal {
        public String furPattern;
        public boolean wasStray;
        public boolean clawed;

        public Cat(String furPattern, boolean wasStray, boolean clawed , int legs, int sizeInInches, boolean isFixed,
                   String name, double weight, String gender) {
                super(legs, sizeInInches, isFixed, name, weight, gender);
                this.furPattern = furPattern;
                this.wasStray = wasStray;
                this.clawed = clawed;
        }

        public void speak() {
                System.out.println("purr");
        }

        public String toString() {
                return ("Fur Pattern: " + furPattern + "\nWas a stray: " + wasStray + "\nWeight in Lbs: " + weight +
                        "\nNumber of legs: " + legs + "\nSize In Inches: " + sizeInInches + "\nIs Fixed: " + isFixed +
                        "\nName: " + name  + "\nGender: " + gender + "\n");

        }
}