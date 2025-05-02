package org.project.creational.builder;

public class RunBuilder {

    public static void main(String[] args){
    //using our builder.
   Person p1 = PersonBuilder.Builder().
           setAge(22)
           .setBodyColor("black")
           .setName("someName")
           .setHeight(1.78)
           .setSex('M')
           .setWeight(79.5)
           .build();

   System.out.println(p1);
   // without builder.

        Person p2 = new Person("someName",22,'M',1.78,79.5,"black");

        System.out.println(p2);

    }
}
