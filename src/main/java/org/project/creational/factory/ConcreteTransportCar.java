package org.project.creational.factory;

public class ConcreteTransportCar extends CreateTransport{

    @Override
    public Transport createTransport(){
        return new Car();
    };

}
