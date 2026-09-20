package org.example.app;

import org.example.AbstractFactory.Button;
import org.example.AbstractFactory.Checkbox;
import org.example.AbstractFactory.GUIFactory;
import org.example.FactoryMethod.Logistics;

public class DeliveryApplication {
    private final GUIFactory factory;
    private final Logistics logistics;

    public DeliveryApplication(GUIFactory factory, Logistics logistics) {
        this.factory = factory;
        this.logistics = logistics;
    }
    public void run(String cargo, String destination) {
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        button.paint();
        checkbox.paint();
        logistics.planDelivery(cargo, destination);
    }
}
