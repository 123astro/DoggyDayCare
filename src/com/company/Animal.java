package com.company;

public class Animal {
       public int legs;
       public int sizeInInches;
       public boolean isFixed;
       public String name;

        public Animal( int legs, int sizeInInches,boolean isFixed, String name ){
            this.legs = legs;
            this.sizeInInches = sizeInInches;
            this.isFixed = isFixed;
            this.name = name;
        }
        public Animal() {

        }

        public void speak() {
            System.out.println(" burp ");
        }

}
