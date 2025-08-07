package TemperatureConverter;

import java.util.Scanner;

public class InputFromUser {
    private  double input;
    private int choice ;

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input for converting the temperature : ");
        input = scanner.nextDouble();
        System.out.println("Enter the choice for the convertion : ");
        choice = scanner.nextInt();
        scanner.close();
    }
    public double getInput(){
        return input;
    }
    public int getChoice(){
        return choice;
    }
}
