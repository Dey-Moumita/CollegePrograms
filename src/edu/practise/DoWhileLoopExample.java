package edu.practise;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        int i =1;
        do{
            if(i%2==0){
                System.out.println(i);
            }
            i++;//i++ always if condition er baire thakbe karon i continue increment hbe
        }while(i<=50);
    }
}
