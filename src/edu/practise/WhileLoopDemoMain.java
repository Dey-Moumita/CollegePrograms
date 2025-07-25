package edu.practise;
//Q. WAP IN JAVA TO PRINT FIRST N WHOLE NUMBER ,N IS THE LIMIT TAKEN FROM THE USER
import java.util.Scanner;
public class WhileLoopDemoMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit for the loop");
        int limit = scanner.nextInt();
        int itr = 1;
        while(itr <= limit){
            System.out.println(itr);
            itr++;
        }

    }
}
