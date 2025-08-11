package edu.practise;

import java.util.Scanner;

public class MultiplicationTableWhileLoop {
    public static void main(String[] args) {
//        int num =6;
//
//        int i = 1;
//        while(i<=10){
//            int value = num*i;
//            System.out.println(num + "*" + i+"="+ value);
//            i++;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        System.out.println("The multiplication table of the given number is : ");
        int i =1;
        while(i<=10){
            int value = num *i;
            System.out.println(num + "*" + i+"="+ value);
            i++;

        }

    }
}
