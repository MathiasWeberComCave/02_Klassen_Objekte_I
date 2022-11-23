package com.cc.java;

public class Cat {

    String name;
    String furColor;
    int age;

    public String tellYourName() {

        return this.name;
    }

    public String tellYourFurcolor() {

        return this.furColor;
    }

    public Integer tellYourAge() {

        return this.age;
    }

    public void tellYourAdress(){
        System.out.println("Blick von innen: " + this); //Peter Schmidt: this ist eine Variable für das Bewusstsein einer Instanz von sich selbst - sogenannte Selbstreferenz
    
        App.tellYourAdress("Jetzt aber");
    
    };
     
}
