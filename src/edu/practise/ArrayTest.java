package edu.practise;

import java.net.Inet4Address;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] choice = {"Rock","Paper","Scissors"};
        System.out.println("Enter a choice");
        String input  = sc.nextLine();

        boolean found = false;
        for (int i=0;i<choice.length;i++){
            if (choice[i].equalsIgnoreCase(input)){
                found = true;
            }
        }



        for (String arrVar : choice){
            if(arrVar.equalsIgnoreCase(input)){
                found = true;
            }
        }



        if (!found){
            System.out.println("Invalid choice");
        }
//        if(!input.equals(choice[0]) && !input.equals(choice[1]) && !input.equals(choice[2])){
//            System.out.println("Invalid choice");
//        }
    }
}
