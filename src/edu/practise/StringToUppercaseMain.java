package edu.practise;


import java.util.Scanner;

public class StringToUppercaseMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.print("ToUpperCase : "+str.toUpperCase());
    }
}
