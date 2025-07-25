package edu.practise;

import java.util.Scanner;
public class StringCheckingPalindromeDemoMain {
    public static void main(String[]args){
        System.out.println("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
         int l = str.length();
         String reverseString = "";
         for(int i = 0;i<l;i++ ){
             reverseString = str.charAt(i) + reverseString;
         }
         if(reverseString.equalsIgnoreCase(str) == true){//ekhane .equalsIgnoreCase likhlaam jaate after reversing the
             // string, result ta original string'er sathe same kina, we are ignoring the case of both maane capital ki
             // small ki mixed KICCCCCCCCHHHHHUUUUU JAAAAAAYYYYY ASSSSSENAAAAAA !!!!!
             System.out.println("Palindrome");
         }
         else{
             System.out.println("Not Palindrome");
         }
    }
}