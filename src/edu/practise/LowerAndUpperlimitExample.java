package edu.practise;

import java.util.Scanner;

public class LowerAndUpperlimitExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lowerlimit : ");
        int lowerLimit = scanner.nextInt();
        System.out.println("Enter the upperlimit : ");
        int upperLimit = scanner.nextInt();
        System.out.println("Press 1 for printing even numbers between the upperlimit & lowelimit\nPress 2 for printing odd numbers between the upperlimit & lowelimit\nEnter the choice : ");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
            do{
                if(lowerLimit%2==0) {
                    System.out.println(lowerLimit);
                }
                lowerLimit++;
            }while(lowerLimit<=upperLimit);
                   break;

            case 2:
                do{
                    if(lowerLimit%2!=0) {
                        System.out.println(lowerLimit);
                    }
                    lowerLimit++;
                }while(lowerLimit<=upperLimit);
                    break;

            default:
                System.out.println("Choice is INVALID");
                   break;
        }

//        do{
//                System.out.println(lowerLimit);
//                lowerLimit++;
//            }while(lowerLimit<=upperLimit);
//
//        switch(choice){
//            case 1: if(lowerLimit%2==0){
//                System.out.println("Printing the all even numbers between the lowerlimit & upperlimit : "+lowerLimit);
//            }
//                 break;
//            case 2:  if(lowerLimit%2!=0){
//                System.out.println("Printing the all odd numbers between the lowerlimit & upperlimit : "+lowerLimit);
//            }
//                 break;
//            default: System.out.println("Choice is INVALID");
//                     break;
//        }

    }
}
