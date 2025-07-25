package edu.practise;

import  java.util.Scanner;
public class TCSNQT2024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i =0;i<10;i++){
            System.out.printf("Enter element no %d : ",(i+1));
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter a target element present inside the array ");
        int element = scanner.nextInt();
        int sum = 0;
        for(int i =0;i<10;i++){
            if(arr[i]>element){
                sum = sum + arr[i];
            }
        }
        System.out.println("The sum of all the elements which are greater than the target element is "+sum);
    }
}
