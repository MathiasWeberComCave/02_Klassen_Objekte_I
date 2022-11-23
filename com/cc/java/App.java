package com.cc.java;

public class App {

    public static void main(String[] args) {

        Cat cat = new Cat("Grizabella", "white", 5);
       
        output(cat.tellYourName());
        output(cat.tellYourFurcolor());
        output(String.valueOf(cat.tellYourAge()));
    
        output("------------------------");

        Dog dog = new Dog("Alonso", "grey", 25);

        output(dog.tellYourName());
        output(dog.tellYourFurcolor());
        output(String.valueOf(dog.tellYourAge()));
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

