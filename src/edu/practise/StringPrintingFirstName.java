package edu.practise;

import java.util.Scanner;

public class StringPrintingFirstName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to get the first name: ");
        String str = sc.nextLine();
        System.out.println("Printing the first name is : ");
        int indexOfSpace = str.indexOf(' ');
        String firstName = str.substring(0,indexOfSpace);
        System.out.println(firstName);


    }
}
