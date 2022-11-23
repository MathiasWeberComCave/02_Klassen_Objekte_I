package com.cc.java;

public class Cat {

    private String name;
    private String furColor;
    private int age;

    public Cat(String name, String furColor, int age) {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void setAge(int age) {
        this.age = age;
    }
     
    
}
