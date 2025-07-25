package edu.practise;

import java.util.Scanner;

public class StringFirstNameManually {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = sc.nextLine();
        int l = name.length();
        int posOfSpace = -1;
        for (int i = 0; i<l; i++){//int i jodi amra loop er vetore likhi tahole seta ekmatro sei loop er method guloi access korte parbe
            char ch = name.charAt(i);//jodi int i loop er baire lekhtm tahole puro class tai ota access korto
            if (ch== ' '){           //tai looper vetorei alaways amra like int i ,int j , mane jekono variable loop er vetorei declare korbo
                posOfSpace = i;
                break;
            }
        }
        System.out.println("The First name is: ");
        for (int j = 0; j<posOfSpace; j++){
            System.out.print(name.charAt(j));
        }

    }
}
