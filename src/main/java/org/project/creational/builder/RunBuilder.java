package org.project.creational.builder;

public class RunBuilder {

    public static void main(String[] args){
   Person p1 = PersonBuilder.Builder().
           setAge(22)
           .setBodyColor("black")
           .setName("someName")
           .setHeight(1.78)
           .setSex('M')
           .setWeight(79.5)
           .build();

   System.out.println(p1);



    }
}
