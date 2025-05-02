package org.project.creational.factory;

public class ConcreteTransportShip extends CreateTransport {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
