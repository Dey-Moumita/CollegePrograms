package edu.practise;


import java.util.Scanner;

public class CalculateTemperatureMain {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input : ");
        double input = scanner.nextDouble();
        System.out.println("Enter the choice for the given input : ");
        int choice = scanner.nextInt();

        double fahrenheit = (input * (9.0/5.0)) + 32;//jkhn datatype double hoi tkhn jodi kono division e whole number thake ,sekhane number er pore point zero diye likhte hoinoito error show krbe

        double celcius = (input - 32)*(5.0/9.0);


        if(choice==1){
            System.out.println("The given input is converted from CELCIUS to FAHRENHEIT " + fahrenheit);
        }
        else if(choice ==2){
            System.out.println("The given input is converted from FAHRENHEIT to CELCIUS " +celcius);
        }
        else{
            System.out.println("User has chosen an invalid option : ");
        }
    }
}
//will be migrating this program into switch case
