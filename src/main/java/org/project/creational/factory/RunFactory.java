package org.project.creational.factory;

public class RunFactory {

    public static void main (String[] args){
        new ConcreteTransportCar().whoIam();
        new ConcreteTransportShip().whoIam();
        new ConcreteTransportTruck().whoIam();


    Transport transportCar = new ConcreteTransportCar().createTransport();
    Transport transportShip = new ConcreteTransportShip().createTransport();
    Transport transportTruck = new ConcreteTransportTruck().createTransport();

    transportCar.use();
    transportShip.use();
    transportTruck.use();

    }
}
