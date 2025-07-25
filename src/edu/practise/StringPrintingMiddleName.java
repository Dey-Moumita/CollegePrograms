package edu.practise;

import java.util.Scanner;
public class StringPrintingMiddleName {
    public static void main(String[]args){
        System.out.println("Enter the name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int l = name.length();
        int PosOfSpace = -1;
        for(int i = 0; i<l ; i++ ){
            char ch = name.charAt(i);
            if(ch == ' '){
                PosOfSpace = i;
                break;
            }
        }
        String middlename = "";
        for(int i = PosOfSpace+1 ; i<l ; i++){
            if(name.charAt(i) != ' '){
                middlename = middlename+name.charAt(i);
            }
            else{
                break;
            }
        }
        System.out.println("Printing the miidle name : "+middlename);
    }
}
