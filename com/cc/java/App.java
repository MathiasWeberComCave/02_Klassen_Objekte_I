package com.cc.java;

public class App {
    

    public static void main(String[] args) {
    Cat cat = new Cat(); 

    cat.name="Grisabell";
    cat.furColor="alpinweiß";
    cat.age= 5;

    Cat cat1 = new Cat(); 

    cat1.name="Alonso";
    cat1.furColor="grau";
    cat1.age= 15;
    
    // output(cat.name);
    // output(cat.furColor);
    // output(String.valueOf(cat.age));

        output(cat.tellYourName());
        output(cat.tellYourFurcolor());
        output(String.valueOf(cat.tellYourAge()));
    output("-----------");
        output(cat1.tellYourName());
        output(cat1.tellYourFurcolor());
        output(String.valueOf(cat1.tellYourAge()));

    // output ("Blick von außen: " + cat);

    // cat.tellYourAdress();



    // Cat cat1 = new Cat();    
    // output ("Blick von außen: " + cat1);

    // cat1.tellYourAdress();

    // App.tellYourAdress("Hallo");

    }

    

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }

    public static void tellYourAdress(String sagWas) {
        System.out.println(sagWas);
    }   
}

