package edu.practise;

import java.util.Scanner;

public class UserInputMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        System.out.println("Enter the initial limit : ");
        int initialLimit = scanner.nextInt();
        System.out.println("Enter the final limit : ");
        int finalLimit = scanner.nextInt();
        System.out.println("The multiplication table of the given number is :");


        if (initialLimit > finalLimit) {
            while (initialLimit >= finalLimit) {
                int value = num * initialLimit;
                System.out.println(num + "*" + initialLimit + "=" + value);
                initialLimit--;
            }
        } else if (initialLimit < finalLimit) {
            while (initialLimit <= finalLimit) {
                int value = num * initialLimit;
                System.out.println(num + "*" + initialLimit + "=" + value);
                initialLimit++;
            }

        } else {
            System.out.println(num + "*" + initialLimit + "=" + (num*initialLimit));
        }
    }
}
 //while(initialLimit<=finalLimit){
//            int value = num*initialLimit;
//            System.out.println(num + "*" +initialLimit+"="+value);
//            initialLimit++;