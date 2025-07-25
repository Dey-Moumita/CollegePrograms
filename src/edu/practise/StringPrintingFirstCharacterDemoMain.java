package edu.practise;

import java.util.Scanner;
public class StringPrintingFirstCharacterDemoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Printing the first character of string : " + str.charAt(0));
    }
}
