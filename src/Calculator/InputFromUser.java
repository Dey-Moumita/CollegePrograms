package Calculator;


import java.util.Scanner;

public class InputFromUser {

    private double firstInput;
    private double secondInput;
    private int choice;

    public void inputFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first input : ");
        firstInput = scanner.nextDouble();
        System.out.println("Enter the second input : ");
        secondInput = scanner.nextDouble();
        System.out.println("Enter the choice : ");
        choice = scanner.nextInt(); //eitto choice input hoe geche already.
        scanner.close();

    }

    public double getFirstInput() {//variable & method name always should be camelcase. variable er jeta datatype hbe setai method lekhar somoy'o sei datatype e hbe.dont do this mistake again
        return firstInput;
    }

    public double getSecondInput() {
        return secondInput;
    }

    public int getChoice() {
        return choice;
    }

//    public void setChoice(int choice) {
//        this.choice = choice;
//
//    } Eita korar kono dorkar nei, ektu bhaab, ami ki kono onno class theke ei setter k daakbo?
    // na tai na? Karon tui toh choice ta inputFromUser'e already input nie nichis tai na?
    //Jokhon ekta jinis already input nie niechis, seita'k alada kore set kno korbo, abr same variable'e?
}
