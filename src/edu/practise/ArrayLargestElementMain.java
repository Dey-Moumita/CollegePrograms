package edu.practise;

import java.util.Scanner;
public class ArrayLargestElementMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n;i++){
            System.out.println("Enter element no: " +(i+1));
            arr[i]= scanner.nextInt();
        }
        int max = arr[0];
        for(int i =0; i<n; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("The maximum element is: " +max);
    }
}
