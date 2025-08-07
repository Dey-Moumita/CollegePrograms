package Calculator;

public class Calculate {
    // private double sum;
    //private double subtraction;
    // private double multiplication;
    // private double division;

    private InputFromUser inputFromUser;

    public Calculate(InputFromUser inputFromUser){
        this.inputFromUser = inputFromUser;
    }

    public void compute(){
        double firstInput = inputFromUser.getFirstInput();
        double secondInput = inputFromUser.getSecondInput();
        int choice = inputFromUser.getChoice();

        if (choice == 1) System.out.println("The sum is : "+(firstInput + secondInput));
        else if (choice == 2) System.out.println("The difference is : " +(firstInput - secondInput));
        else if (choice == 3) System.out.println("The product is : " +(firstInput * secondInput));
        else if (choice == 4) System.out.println("The division is : " +(firstInput / secondInput));
        else System.out.println("INVALID CHOICE");
    }




//    public double calculateSum(){
//        sum = inputFromUser.getFirstInput() + inputFromUser.getSecondInput;ondond
//        return sum;
//    }
//    public double calculateSubtraction(){
//        subtraction = inputFromUser.getFirstInput() - inputFromUser.getSecondInput;
//        return subtraction;
//    }
//    public double calculateMultiplication(){
//        multiplication= inputFromUser.getFirstInput() * inputFromUser.getSecondInput;
//        return multiplication;
//    }
//    public double calculateDivision(){
//        division = inputFromUser.getFirstInput() / inputFromUser.getSecondInput;
//        return division;
//    }

}


