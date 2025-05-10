package org.project.behavioral.observer;

import java.util.HashSet;

import java.util.Set;

public class Publisher {

private final Set<Observer> subscribers = new HashSet<>();

    protected void addSubscriber(Subscriber subscriber){
            this.subscribers.add(subscriber);
    }

    protected void removeSubscriber(Subscriber subscriber){
        this.subscribers.remove(subscriber);
    }

    protected void notifySubscribers(){
        subscribers.forEach(Observer::update);

    }




}
