package org.project.creational.builder;

public class Person {
    private String name;
    private int age;
    private char sex;
    private double height;
    private double weight;
    private String bodyColor;

    protected Person(String name,int age,char sex,double height,double weight, String bodyColor){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.bodyColor = bodyColor;
    }

    @Override
    public String toString(){
        return "name: " +
                this.name + " " + "age: " +
                this.age +  " " +  "sex: " +
                this.sex +  " " + "height: " +
                this.height +  " " + "weight: " +
                this.weight +  " " + "body Color: " +
                this.bodyColor;
    }
}
