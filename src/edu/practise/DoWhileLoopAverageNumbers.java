package edu.practise;

public class DoWhileLoopAverageNumbers {
    public static void main(String[] args) {
         int i =1;
         int sum =0;
         int avg;
         do{
             sum =sum +i;
             i++;
         }while(i<=5);
         avg = sum/5;
        System.out.println(avg);
    }
}
