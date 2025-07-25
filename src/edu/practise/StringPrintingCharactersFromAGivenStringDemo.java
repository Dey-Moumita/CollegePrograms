package edu.practise;

import java.util.Scanner;

public class StringPrintingCharactersFromAGivenStringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine(); //Moumita
        int l = input.length();//7
        System.out.println("Printing 1 by 1 character of the given string: ");
        for(int i = 0; i<l;i++){
            System.out.println(input.charAt(i));
        }
    }
}
