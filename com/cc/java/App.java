package com.cc.java;

public class App {
    

    public static void main(String[] args) {
     
        Cat cat = new Cat("Grisabella", "alpinweiß", 5);

        output(cat.tellYourName());
        output(cat.tellYourFurcolor());
        output(String.valueOf(cat.tellYourAge()));

        Cat cat1= new Cat("Alsonso", "grey", 15);

        output(cat1.tellYourName());
        output(cat1.tellYourFurcolor());
        output(String.valueOf(cat1.tellYourAge()));
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

