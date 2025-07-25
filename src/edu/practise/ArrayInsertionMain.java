package edu.practise;
import java.util.Scanner;
public class ArrayInsertionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the no. of element of the array,max size=9: ");
        int size = scanner.nextInt();
        for(int i = 0; i<size; i++) {
            System.out.println("Enter element no.: " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the element that you want to insert: ");
        int element = scanner.nextInt();
        System.out.println("Enter the position where you want to insert:");
        int pos = scanner.nextInt();
        for(int i = size-1; i>= pos-1; i--){
            arr[i+1] =arr[i];
        }
        arr[pos-1] = element;
        size++;
    }
}
