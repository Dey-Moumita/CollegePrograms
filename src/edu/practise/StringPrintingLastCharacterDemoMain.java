package edu.practise;

import java.util.Scanner;
public class StringPrintingLastCharacterDemoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int l = str.length();
        System.out.println("Printing the last character : " + str.charAt(l-1));
    }
}
