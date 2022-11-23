package com.cc.java;

import javax.swing.InputMap;

public class App {

    public static void main(String[] args) {

        Cat cat = new Cat("Grizabella", "white", 5);

        output(cat.tellYourName());
        output(cat.tellYourFurcolor());
        output(String.valueOf(cat.tellYourAge()));
    
        output("------------------------");

        Dog dog = new Dog("Alonso", "grey", 25);

        dog.setAge(5);

        output(dog.getName());
        output(dog.getFurColor());
        output(String.valueOf(dog.getAge()));

        output("------------------------");
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

