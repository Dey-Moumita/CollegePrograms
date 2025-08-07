package edu.practise;

import java.util.Scanner;

public class BankAccountOperationCheckerSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        double amount = scanner.nextDouble();
        System.out.println("Enter the balance : ");
        double balance = scanner.nextDouble();
        System.out.println("Press 1 for WITHDRAW \nPress 2 for DEPOSIT \nEnter the choice : ");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                if(amount>balance){
                    System.out.println("Insufficient funds");
                }else{
                    System.out.println("Withdraw successful");
                }
                break;
            case 2:
                if(amount>100000){
                    System.out.println("KYC needed");
                }else{
                    System.out.println("Deposit successful");
                }
                break;
            default:
                System.out.println("Please: \nPress 1 for WITHDRAW \nPress 2 for DEPOSIT \nEnter your choice CORRECTLY");
        }
    }
}
