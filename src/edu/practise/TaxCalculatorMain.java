package edu.practise;

import java.util.Scanner;

public class TaxCalculatorMain {
    public static void main(String[] args) {
        double totalTaxamount = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the annual income : ");
        double annualIncome = scanner.nextDouble();

        if (annualIncome <= 250000) {
            totalTaxamount = annualIncome;
            System.out.println("No tax applied");
        } else if (annualIncome >= 250000 && annualIncome <= 500000) {
            totalTaxamount = (annualIncome * 0) * 0.05;
            System.out.println("5% tax applied so total tax amount is : " + totalTaxamount);
        } else if (annualIncome >= 500001 && annualIncome <= 1000000) {
            totalTaxamount = ((annualIncome * 0) * 0.05)*0.2;
            System.out.println("20%% tax applied so total tax amount is : " + totalTaxamount);
        } else if (annualIncome > 1000000) {
            totalTaxamount = (((annualIncome * 0) * 0.05)*0.2)*0.3;
            System.out.println("30% tax applied so total tax amount is : " + totalTaxamount);
        }
    }
}
