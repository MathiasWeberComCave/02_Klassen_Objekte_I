package com.cc.java;

public class Dog {

    private String name;
    private String furColor;
    private int age;

    public Dog(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    


    }
