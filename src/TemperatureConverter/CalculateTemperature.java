package TemperatureConverter;

public class CalculateTemperature {
    private InputFromUser inputFromUser;
    public CalculateTemperature(InputFromUser inputFromUser){
        this.inputFromUser = inputFromUser;
    }

    public void calculate(){
        double calculateInput = inputFromUser.getInput();
        int calculateChoice = inputFromUser.getChoice();



        if(calculateChoice == 1){
            double fahrenheit = (calculateInput * (9.0/5.0)) + 32;
            System.out.println("The given input is converted from CELCIUS to FAHRENHEIT : " + fahrenheit);
        }
        else if(calculateChoice == 2){
            double celcius   =  (calculateInput - 32)*(5.0/9.0);
            System.out.println("The given input is converted from FAHRENHEIT to CELCIUS : " + celcius);
        }
        else {
            System.out.println("INVALID CHOICE");
        }
    }

}
