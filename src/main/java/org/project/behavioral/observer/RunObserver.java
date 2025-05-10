package org.project.behavioral.observer;

public class RunObserver {


    public static void main(String[] args) {

    Subscriber subscriber1 = new Subscriber(1);
    Subscriber subscriber2 = new Subscriber(2);
    Subscriber subscriber3 = new Subscriber(3);

    Publisher publisher = new Publisher();

        publisher.addSubscriber(subscriber1);
        publisher.addSubscriber(subscriber2);
        publisher.addSubscriber(subscriber3);

        System.out.println(subscriber3.getState());
        System.out.println(subscriber2.getState());
        System.out.println(subscriber1.getState());

        publisher.notifySubscribers();

        System.out.println(subscriber3.getState());
        System.out.println(subscriber2.getState());
        System.out.println(subscriber1.getState());




    }

}
