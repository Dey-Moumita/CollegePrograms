package edu.practise;

import java.util.Scanner;

public class SumArrayDemoMain {
    public static void main(String[] args) {
//        System.out.println("Enter numbers one by one from the user");
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int arr[] = new int[5];
        for(int i =0; i<5 ;i++){
            System.out.print("Enter element no "+(i+1)+": ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i<5; i++){
            sum = sum + arr[i];
        }
        System.out.println("The sum is "+sum);
    }
}
