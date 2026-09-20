package org.example;
import org.example.AbstractFactory.GUIFactory;
import org.example.AbstractFactory.MacOSFactory;
import org.example.AbstractFactory.WindowsFactory;
import org.example.FactoryMethod.Logistics;
import org.example.FactoryMethod.RoadLogistics;
import org.example.FactoryMethod.SeaLogistics;
import org.example.app.DeliveryApplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Delivery mode (ROAD/SEA): ");
        String mode = scanner.nextLine().trim().toUpperCase();
        System.out.print("UI platform (WINDOWS/MACOS): ");
        String platform = scanner.nextLine().trim().toUpperCase();
        Logistics logistics;
        switch (mode) {
            case "ROAD":
                logistics = new RoadLogistics();
                break;
            case "SEA":
                logistics = new SeaLogistics();
                break;
            default:
                System.out.println("Unsupported delivery mode: " + mode);
                return;
        }
        GUIFactory factory;
        switch (platform) {
            case "WINDOWS":
                factory = new WindowsFactory();
                break;
            case "MACOS":
                factory = new MacOSFactory();
                break;
            default:
                System.out.println("Unsupported UI platform: " + platform);
                return;
        }
        new DeliveryApplication(factory, logistics).run("laboratory equipment", "Aktau warehouse");
    }
}
