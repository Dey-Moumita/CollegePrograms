package edu.practise;
import java.util.Scanner;

public class AdditionMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number :");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number :");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the third number :");
        double num3 = scanner.nextDouble();

        System.out.println("The sum of two numbers : " +(num1+num2));
        System.out.println("The subtraction of two numbers : " +(num1-num2));
        System.out.println("The multiplication of two numbers : " +(num1*num2));
        System.out.println("The division of two numbers : " +(num1/num2));
        System.out.println("The average of the three numbers : " +(num1+num2+num3)/3);
    }
}
