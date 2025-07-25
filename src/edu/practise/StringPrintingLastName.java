package edu.practise;

import java.util.Scanner;
public class StringPrintingLastName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String str = sc.nextLine();
        int l = str.length();
        int posOfSpace = -1;
        for(int i = l-1;i>=0;i--){
            char ch = str.charAt(i);
            if(ch== ' '){
                posOfSpace = i;
                break;
            }
        }
        String lastName = "";
        for(int i =posOfSpace+1;i<l;i++){
            lastName = lastName + str.charAt(i);
        }
        System.out.println("The last name is: "+lastName);
    }
}
