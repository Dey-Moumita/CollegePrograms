package Calculator;

public class CalculatorMain {
    public static void main(String[] args) {

        InputFromUser inputFromUser = new InputFromUser();
        inputFromUser.inputFromUser();
        Calculate calculate = new Calculate(inputFromUser);
        calculate.compute();
        //System.out.println("The sum is : " );
        // System.out.println("The difference is : ");
        // System.out.println("The product is : ");
        // System.out.println("The division is : ");

    }
}
