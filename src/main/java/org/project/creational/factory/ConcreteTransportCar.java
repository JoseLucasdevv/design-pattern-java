package org.project.creational.factory;

public class ConcreteTransportCar extends CreateTransport{


    public Transport createTransport(){
        return new Car();
    };

}
