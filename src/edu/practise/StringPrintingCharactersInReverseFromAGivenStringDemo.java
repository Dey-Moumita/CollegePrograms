package edu.practise;

import java.util.Scanner;
public class StringPrintingCharactersInReverseFromAGivenStringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        int l = str.length();
        System.out.println("Printing the all characters in reverse : ");
        for (int i = l-1;i>=0;i--){
            System.out.println(str.charAt(i));
        }
    }
}
