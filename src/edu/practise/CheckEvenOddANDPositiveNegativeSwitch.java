package edu.practise;

import java.util.Scanner;

public class CheckEvenOddANDPositiveNegativeSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
       // double number = scanner.nextDouble();
        int  number = scanner.nextInt();
//        System.out.println("Press 0 for EVEN \nPress 1 for ODD \nEnter the choice : ");
//        int choice = scanner.nextInt();
//
//        switch(choice){
//            case 0:
//                if(number % 2 == 0){
//                    if(number < 0){
//                        System.out.println("Even & Negative");
//                    }
//                    else {
//                        System.out.println("Even & Positive");
//                    }
//                }
//                break;
//            case 1:
//                if(number % 2 != 0){
//                    if(number < 0){
//                        System.out.println("Odd & Negative");
//                    }
//                    else {
//                        System.out.println("Odd & Positive");
//                    }
//                }
//                break;
//            default:
//                System.out.println("please: \nPress 0 for EVEN \nPress 1 for ODD \nEnter your choice ");


        switch(number % 2){
            case 0:
                    if(number < 0){
                        System.out.println("Even & Negative");
                    }
                    else {
                        System.out.println("Even & Positive");
                    }
                break;
            case 1:
                System.out.println("Odd & Positive");
                break;
            case -1:
                System.out.println("Odd & Negative");
                break;
        }
//        int testnum1 = -4 % 2;
//        int testnum2 = -3 % 2;
//        System.out.println(testnum1);
//        System.out.println(testnum2);
    }
}
