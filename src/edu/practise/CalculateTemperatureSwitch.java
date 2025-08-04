package edu.practise;

import java.util.Scanner;

public class CalculateTemperatureSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input : ");
        double input = scanner.nextDouble();
        System.out.println("Enter the choice for the given input : ");
        int choice = scanner.nextInt();

        double fahrenheit = (input * (9.0 / 5.0)) + 32;

        double celcius = (input - 32) * (5.0 / 9.0);


        switch (choice) {
            case 1:
                System.out.println("The given input is converted from CELCIUS to FAHRENHEIT " + fahrenheit);
                break;

            case 2:
                System.out.println("The given input is converted from FAHRENHEIT to CELCIUS " + celcius);
                break;

            default:
                System.out.println("User has chosen an invalid option : ");

            }
        }
    }