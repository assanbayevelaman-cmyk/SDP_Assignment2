# SDP_Assignment2

Purpose: demonstrate Factory Method (transport) and Abstract Factory (UI family) in one console application.

## Package Structure

src/
|_org/example/
  |_Main.java
  |_FactoryMethod/
  | |_Transport.java
  | |_Truck.java
  | |_Ship.java
  | |_Logistics.java
  | |_RoadLogistics.java
  | |_SeaLogistics.java
  |_AbstractFactory/
  | |_Button.java
  | |_Checkbox.java
  | |_WindowsButton.java
  | |_WindowsCheckbox.java
  | |_MacOSButton.java
  | |_MacOSCheckbox.java
  | |_GUIFactory.java
  | |_WindowsFactory.java
  | |_MacOSFactory.java
  |_app/
    |_DeliveryApplication.java

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
