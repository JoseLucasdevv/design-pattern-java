package org.project.creational.singleton;

public final class Singleton {
    private static Singleton instance;
    private String value;
    private Singleton(String value){
    this.value = value;
    }

    public static Singleton getInstance(String value){
        if (Singleton.instance == null){
            System.out.println("we create your only one instance !");
           Singleton.instance = new Singleton(value);
           return Singleton.instance;
        }
       System.out.println("you already have an instance");
        return Singleton.instance;
    }

    public void getUserFromDB(){
        System.out.println("fetch User from DB: " + value);
    }

}
