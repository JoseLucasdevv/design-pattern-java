package org.project.creational.builder;

public interface IBuilder {
    static PersonBuilder Builder(){
        return new PersonBuilder();
    }
    Person build();
    PersonBuilder setAge(int age);
    PersonBuilder setBodyColor(String bodyColor);
    PersonBuilder setHeight(double height);
    PersonBuilder setName(String name);
    PersonBuilder setSex(char sex);
    PersonBuilder setWeight(double weight);


}
