package edu.practise;

import java.util.Scanner;

public class ArrayTargetElementFoundMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1,2,3,4,5,6,7,8,9};

        System.out.println("Enter a element to search for : ");
        int target = scanner.nextInt();
        boolean isFound = false;

        for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
                System.out.println("Element found at index : " +i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element is not present in array");
        }
    }
}
