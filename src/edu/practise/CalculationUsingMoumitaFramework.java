package edu.practise;

import java.util.Scanner;

public class CalculationUsingMoumitaFramework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The result is "+AdditionUtil.add(num1,num2));
    }
}
