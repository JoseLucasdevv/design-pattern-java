package org.project.creational.factory;

public abstract class CreateTransport {

    public abstract Transport createTransport();

    public void whoIam () {
        Transport t = this.createTransport();
        t.use();
    }

}
