package edu.practise;

import java.util.Scanner;

public class ElectricityBillCalculatorMain {
    public static void main(String[] args) {
        int units ;//eitao local  variable tai user input dichhe r etike next.Input() method diye daka hochhe to ei variable ta oi method diye populate mne fill hochhe tai etake initialize krchina

        double totalBillAmount = 0.0;//eta jehetu local variable, ei variable er moddhe calculate kore 1tavalue store hye print hbe tai etake initialize krte hbe.
        double bill ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of units consumed : ");
        units = scanner.nextInt();
        System.out.println();

        if (units >= 0 && units <= 100) {
            totalBillAmount = (units * 1.00);
            System.out.println("If rate per unit is rupees 1.00 for (0-100 units) consumption that time total bill is : " + totalBillAmount);
        } else if (units >= 101 && units <= 200) {
            totalBillAmount = (100 * 1.00) + ((units - 100) * 2.00);
            System.out.println("If rate per unit is rupees 2.00 for (101-200 units) consumption that time total bill is : " + totalBillAmount);
        } else if (units >= 201 && units <= 300) {
            totalBillAmount = (100 * 1.00) + (100 * 2.00) + ((units - 200) * 3.00);
            System.out.println("If rate per unit is rupees 3.00 for (201-300 units) consumption that time total bill is : " + totalBillAmount);
        } else if (units > 300) {
            totalBillAmount = (100 * 1.00) + (100 * 2.00) + (100 * 3.00) + ((units - 300) * 5.00);
            System.out.println("If rate per unit is rupees 5.00 for (above 300 units) consumption that time total bill is : " + totalBillAmount);
        }

        if (totalBillAmount > 1000) {
            bill = totalBillAmount + 50;
            System.out.println("The bill is : " +bill);
        } else {
            System.out.println("The total bill will remain same");
        }

    }
}
