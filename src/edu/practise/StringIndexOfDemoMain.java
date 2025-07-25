package edu.practise;

import java.util.Scanner;

public class StringIndexOfDemoMain {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(input.indexOf('a',2));
//ei character ta jodi string er moddhe na thake tahole default value -1 show korbe
        System.out.println(input.lastIndexOf('a'));
    }
}
