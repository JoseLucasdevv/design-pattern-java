package org.project.behavioral.observer;

public class Subscriber implements Observer {
    private String state = null;
    private int instance;
    public Subscriber(int instance){
        this.instance = instance;
    }

    @Override
    public void update() {
        this.state = "New State";
        System.out.println("Subscriber: " + this.state + " instance: " + this.instance);
    }

    public String getState() {
        return state;
    }
}
