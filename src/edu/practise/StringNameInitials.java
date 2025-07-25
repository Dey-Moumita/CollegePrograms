package edu.practise;


import java.util.Scanner;
public class StringNameInitials{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int length = str.length();
        str = ' '+ str;//ekhane amra string er age ekta space add korlam
        System.out.println("The initial character of the string : ");//jekono statement loop er vetor debo na karon tahole loop jotobar chlbe statement tao otobar print hye jbe
        for(int i =0;i<length;i++){
            char ch = str.charAt(i);
            if(ch ==' '){
                System.out.print(str.charAt(i+1));//ekhane +1 korechi karon ith position ta to space ,amader otar pore character take print krate hbe tai
            }
        }
    }
}