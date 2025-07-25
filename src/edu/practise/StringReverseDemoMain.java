package edu.practise;

import java.util.Scanner;
public class StringReverseDemoMain {
    public static void main(String[]args){
        System.out.println("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int l = str.length();
        String reversestring = "";
//        for(int i = l-1;i>=0;i--){
//            //System.out.println(str.charAt(i));
//            //System.out.println(reversestring = reversestring+ str.charAt(i));
//            reversestring = reversestring + str.charAt(i);
//        }

        for (int i = 0; i<l; i++){
            reversestring = str.charAt(i)+reversestring;
        }
        System.out.println("Printing the reverse string :"+reversestring);
    }
}
