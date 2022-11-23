package com.cc.java;

public class App {
    
    public static void main(String[] args) {

    
        Cat cat = new Cat();
        cat.name = "Grizabella";
        cat.furColor = "white";
        cat.age = 29;

        // output(cat.name);
        // output(cat.furColor);
        // output(String.valueOf(cat.age));
       
        output(cat.tellYourName());
        output(cat.tellYourFurColor());
        output(String.valueOf(cat.tellYourAge()));
    
        output("------------------------");

        Cat cat1 = new Cat();
        cat1.name = "Alonzo";
        cat1.furColor = "grey";
        cat1.age = 35;

        output(cat1.tellYourName());
        output(cat1.tellYourFurColor());
        output(String.valueOf(cat1.tellYourAge()));


    }

    // Methode witrd aus der KLASSE aufgerufen, daher static
    public static void output(String outputStr) {
        System.out.println(outputStr);
    }




}

