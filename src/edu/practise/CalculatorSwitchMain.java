package edu.practise;

import java.util.Scanner;

public class CalculatorSwitchMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first input : ");
        double firstInput = scanner.nextDouble();
        System.out.println("Enter the second input : ");
        double secondInput = scanner.nextDouble();
        System.out.println("Enter the choice : ");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println("The sum is: " + (firstInput + secondInput));
                break;
            case 2:
                System.out.println("The difference is: " + (firstInput - secondInput));
                break;

            case 3:
                System.out.println("The product is: " + (firstInput * secondInput));
                break;

            case 4:
                System.out.println("The division is: " + (firstInput / secondInput));
                break;

            default:
                System.out.println("INVALID CHOICE");

        }
    }
}
