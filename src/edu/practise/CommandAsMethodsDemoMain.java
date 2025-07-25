package edu.practise;

 class Light {
    public void turnOn() {
        System.out.println("The light is ON.");
    }
    public void turnOff() {
        System.out.println("The light is OFF.");
    }
}
// Command as a method
public class CommandAsMethodsDemoMain {
    public static void main(String[] args) {
        Light light = new Light();
        light.turnOn();  // Directly invoking the method
        light.turnOff(); // Directly invoking the method
    }
}
