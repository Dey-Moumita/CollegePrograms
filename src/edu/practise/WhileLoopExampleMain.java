package edu.practise;
//Q.WAP TO PRINT ALL THE ODD NUMBERS FROM 1 TO 19 USING WHILE LOOP
public class WhileLoopExampleMain {
    public static void main(String[] args) {
        int value =2;
        while(value <= 20){
            if(value % 2 == 0){
                System.out.println(value);
                value++;
            }
        }
    }
}
