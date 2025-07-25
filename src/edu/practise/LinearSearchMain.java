package edu.practise;

import java.util.Scanner;
public class LinearSearchMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter element no %d : ",(i+1));
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to be searched in the array: ");
        int elementToBeSearched = scanner.nextInt();
        boolean flag = false;
        int pos = -1;
        for (int i = 0; i < 5; i++) {
            if (elementToBeSearched ==arr[i]){
                pos = i+1;//i+1 mane position print hobe r jodi i likhi tahole oi element er index no. print hbe
                flag = true;
                break;
            }
        }
        if (flag == true){
            System.out.println("Search Successful yaaaaaaaay and the element is found at position no:"+(pos));
        }
        else {
            System.out.println("Search Unsuccessful, naaaaaaay");
        }
    }
}
