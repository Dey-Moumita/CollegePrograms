package TemperatureConverter;

public class Main {
    public static void main(String[] args) {

        InputFromUser inputFromUser = new InputFromUser();
        inputFromUser.input();
        CalculateTemperature calculateTemperature = new CalculateTemperature(inputFromUser);
        calculateTemperature.calculate();
    }
}
