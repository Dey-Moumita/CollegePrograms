package edu.practise;

import java.util.Scanner;

public class ArrayInputOutputDemoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];


       for (int i = 0; i<5; i++){
            System.out.println("Enter element at position no "+(i)+": ");
            arr[i] = sc.nextInt();

        }

        System.out.println("Printing the elements of the array: ");
        for (int i =0;i<5;i++){
            System.out.println(arr[i]);
        }

  //      System.out.println("Hello");
    }
}
