package com.cc.java;

public class App {
    
    public static void main(String[] args) {

    
        Cat cat = new Cat("Grizabella","white",29);
       
        output(cat.tellYourName());
        output(cat.tellYourFurColor());
        output(String.valueOf(cat.tellYourAge()));
    
        output("------------------------");

       Cat cat1 = new Cat("Alonzo", "grey", 35);

        output(cat1.tellYourName());
        output(cat1.tellYourFurColor());
        output(String.valueOf(cat1.tellYourAge()));


    }

    // Methode witrd aus der KLASSE aufgerufen, daher static
    public static void output(String outputStr) {
        System.out.println(outputStr);
    }




}

