package org.project.creational.builder;

public class PersonBuilder implements IBuilder {

    private String name;
    private int age;
    private char sex;
    private double height;
    private double weight;
    private String bodyColor;

    public PersonBuilder(){}

    public static PersonBuilder Builder(){
        return new PersonBuilder();
    }

    public Person build(){
        return new Person(this.name,this.age,this.sex,this.height,this.weight,this.bodyColor);
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
        return this;
    }

    public PersonBuilder setHeight(double height) {
        this.height = height;
        return this;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSex(char sex) {
        this.sex = sex;
        return this;
    }

    public PersonBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }

}
