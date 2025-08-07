package edu.practise;

import java.util.Scanner;

public class CheckVowelConsonantSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character to check it's a VOWEL or NOT : ");
        char character = scanner.next().charAt(0);

        switch(character){
            case 'a':
                System.out.println("it's a vowel");
                break;
            case 'e':
                System.out.println("it's a vowel");
                break;
            case 'i':
                System.out.println("it's a vowel");
                break;
            case 'o':
                System.out.println("it's a vowel");
                break;
            case 'u':
                System.out.println("it's a vowel");
                break;
            default:
                System.out.println("it's not a vowel");
        }
    }
}
