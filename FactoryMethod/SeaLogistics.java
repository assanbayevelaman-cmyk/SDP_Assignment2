package org.example.FactoryMethod;

public class SeaLogistics extends Logistics {
    public Transport createTransport() {
        return new Ship();
    }
}
