package edu.practise;

import java.util.Scanner;

public class CalculateInputsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first input : ");
        double firstInput = scanner.nextDouble();
        System.out.println("Enter the second input : ");
        double secondInput = scanner.nextDouble();
        System.out.println("Enter the choice : ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("The sum of the given inputs is :" + (firstInput + secondInput));
        } else if (choice == 2) {
            System.out.println("The difference of the given inputs is : " + (firstInput - secondInput));
        } else if (choice == 3) {
            System.out.println("The product of the given inputs is : " + (firstInput * secondInput));
        } else if (choice == 4) {
            System.out.println("The product of the given inputs is : " + (firstInput / secondInput));
        } else {
            System.out.println("INVALID CHOICE");
        }
    }
}
