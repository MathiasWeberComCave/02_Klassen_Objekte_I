package com.cc.java;

public class Dog {

    public String name;
    public String furColor;
    public int age;

    public Dog(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    public String tellYourName() {
       return this.name;
    }

    public String tellYourFurcolor() {
        return this.furColor;
    }

    public Integer tellYourAge() {
        return this.age;
    }
     
}
