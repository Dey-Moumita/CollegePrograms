package edu.practise;

import  java.util.Scanner;
public class ProductArrayDemoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[4];
        for(int i=0;i<4;i++){
            System.out.println("Enter the no");
            arr[i] = scanner.nextInt();
        }
        int product = 1;
        for(int i =0;i<4;i++){
            product = product*arr[i];
        }
        System.out.println("The product is "+product);
    }
}
