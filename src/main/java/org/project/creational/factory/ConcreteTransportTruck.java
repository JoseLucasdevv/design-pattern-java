package org.project.creational.factory;

public class ConcreteTransportTruck  extends CreateTransport{

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
