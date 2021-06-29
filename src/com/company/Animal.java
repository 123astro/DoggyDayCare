package com.company;

public class Animal {
       public int legs;
       public int sizeInInches;
       public boolean isFixed;
       public String name;
       public double weight;
       public String gender;

        public Animal( int legs, int sizeInInches,boolean isFixed, String name, double weight, String gender){
            this.legs = legs;
            this.sizeInInches = sizeInInches;
            this.isFixed = isFixed;
            this.name = name;
            this.weight = weight;
            this.gender = gender;
        }


        public void speak() {
            System.out.println(" burp ");
        }

}


