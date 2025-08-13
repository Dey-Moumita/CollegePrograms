package edu.practise;

import java.util.Scanner;

public class DoWhileLoopLimitEXample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower limit : ");
        int lowerLimit = scanner.nextInt();
        System.out.println("Enter the upper limit : ");
        int upperLimit = scanner.nextInt();


            if(lowerLimit>upperLimit) {
                System.out.println("Printing the numbers in reverse order:");

                do {
                    System.out.println(lowerLimit);
                    lowerLimit--;
                } while (lowerLimit >= upperLimit);
            }
            else if(lowerLimit<upperLimit) {
                System.out.println("printing the numbers in ascending order:");

                do {
                    System.out.println(lowerLimit);
                    lowerLimit++;
                } while (lowerLimit<=upperLimit);
            }
            else {
                System.out.println(lowerLimit);
            }

            }
            }
