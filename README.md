# SDP_Assignment2

Purpose: demonstrate Factory Method (transport) and Abstract Factory (UI family) in one console application.

## Package Structure

- `src/org/example/`
  - `Main.java`
  - `FactoryMethod/`
    - `Transport.java`
    - `Truck.java`
    - `Ship.java`
    - `Logistics.java`
    - `RoadLogistics.java`
    - `SeaLogistics.java`
  - `AbstractFactory/`
    - `Button.java`
    - `Checkbox.java`
    - `WindowsButton.java`
    - `WindowsCheckbox.java`
    - `MacOSButton.java`
    - `MacOSCheckbox.java`
    - `GUIFactory.java`
    - `WindowsFactory.java`
    - `MacOSFactory.java`
  - `app/`
    - `DeliveryApplication.java`

## Prerequisites
- JDK 17
- IntelliJ IDEA (recommended)

## How to Run

1. Open the project folder in IntelliJ IDEA.
2. Open `src/org/example/Main.java`.
3. Click the `Run` button.

## Supported Input Values

Delivery Mode: ROAD/SEA

UI Platform: WINDOWS/MACOS

## Sample Run

Delivery mode (ROAD/SEA): ROAD

UI platform (WINDOWS/MACOS): WINDOWS

Rendering Windows button

Rendering Windows checkbox

Truck delivers laboratory equipment to Aktau warehouse
