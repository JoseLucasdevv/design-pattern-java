package org.project.creational.singleton;

public class Run {

    public static void main(String[] args){
        Singleton DB = Singleton.getInstance("my User1 from DB1");
        Singleton DB2 = Singleton.getInstance("my User 1 from DB2 ");

        DB.getUserFromDB();
        DB2.getUserFromDB();

    }
}
