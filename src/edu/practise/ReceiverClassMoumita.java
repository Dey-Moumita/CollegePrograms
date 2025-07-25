package edu.practise;

//Command interface define korchi ami, karon command interface die command deoa hobe.
interface Command{
    public void execute();
}


//Receiver class'k define korchi ami, receiver class'ta hoche shei class'ta jei class'ta tey operation perform kora hbe
public class ReceiverClassMoumita {
    public void happyMode(){
        System.out.println("Moumita khub happy karon, Moumita first hoeche");
    }

    public void sadMode(){
        System.out.println("Moumita khub dukhi karon Moumita'r friend'der sathe Jhogra hoeche");
    }

    public void fearMode(){
        System.out.println("Moumita khub bhoy'e ache, karon samne 100'ta KUKUR dariye...yikes yikes yikes");
    }
}


//Receiver class'er j method/behavior gulo ache, seigulo ami directly execute korbo na, ami command interface die
//execute korabo. But command to ekta interface ki kore korabo? Seita'r jonno amake interface take implement kore,
//tar method'er concrete implementation dite hobe. Amr main objective/goal ta ki? Main objective hoche ReceiverClassMoumita'r
//happyMode(),sadMode() and fearMode() k execute korano. And prottek'ta ReceiverClassMoumita'r method'er jonno ami ekta
//concrete implementation class banabo

//Shuru korlam banano complete implementation classes:

//Creating concrete implementation class for executing happyMode() of Moumita
class happyModeCommand implements Command{
    private ReceiverClassMoumita obj; // declaring a private instance variable "obj" which is of type ReceiverClassMoumita

    public happyModeCommand(ReceiverClassMoumita obj){ //Creating a constructor of happyModeCommand class with the
        //parameter "obj" which is also of type ReceiverClassMoumita.
        this.obj = obj; //the value that will come in the parameter obj will be assigned to the private instance variable "obj"
    }

    @Override
    public void execute() { //overriding the execute() of the Command interface
        obj.happyMode();//with the help of the instance variable, I'm excuting the happyMode() method of ReceiverClassMoumita
    }
}



//Creating concrete implementation class for executing sadMode() of Moumita
class sadModeCommand implements Command{
    private ReceiverClassMoumita obj; // declaring a private instance variable "obj" which is of type ReceiverClassMoumita

    public sadModeCommand(ReceiverClassMoumita obj){ //Creating a constructor of sadModeCommand class with the
        //parameter "obj" which is also of type ReceiverClassMoumita.
        this.obj = obj; //the value that will come in the parameter obj will be assigned to the private instance variable "obj"
    }

    @Override
    public void execute() { //overriding the execute() of the Command interface
        obj.sadMode();//with the help of the instance variable, I'm excuting the sadMode() method of ReceiverClassMoumita
    }
}


//Creating concrete implementation class for executing fearMode() of Moumita
class fearModeCommand implements Command{
    private ReceiverClassMoumita obj; // declaring a private instance variable "obj" which is of type ReceiverClassMoumita

    public fearModeCommand(ReceiverClassMoumita obj){ //Creating a constructor of fearModeCommand class with the
        //parameter "obj" which is also of type ReceiverClassMoumita.
        this.obj = obj; //the value that will come in the parameter obj will be assigned to the private instance variable "obj"
    }

    @Override
    public void execute() { //overriding the execute() of the Command interface
        obj.fearMode();//with the help of the instance variable, I'm excuting the fearMode() method of ReceiverClassMoumita
    }
}



//Ekhon obdhi amr receiver class set up complete, command interface complete, 3 tey methods of the receiver class'er jonno
//3 tey alada concrete Command class complete. Dhore nao maa'k mutton ranna korte bolecho, uni ranna kore boshe achen,
//onar theke chaite hobe toh khawar jonno. Seram'e amader mechanism create kora hoe geche, eibar amake daakte hobe toh method
//gulo'k, tai ami banabo INVOKER CLASS jey ei method gulo'k execute korbe.

//Creating the INVOKER CLASS

class MoumitasExtraOrdinaryBrain {
    private Command obj; // ekta private instance variable declare korlam Command type'r

    public void setObj(Command obj) { //ekta setter method declare korlaam jeita kina ekta parameter niche "Command" type'r
        this.obj = obj; //private instance obj variable'er bhetore, pareameter'er jei value ta obj tey asche seita set kore diche
    }

    public void executeCommand(){//ekta method declare korlam, jar kaaj hoche command take execute kora
        obj.execute();
    }
}


//Main class define korchi, for connecting the dots.
class Main{
    public static void main(String[] args) {
        //Creating the actual receiver by creating it's object.,
        ReceiverClassMoumita receiverObject = new ReceiverClassMoumita(); //ReceiverClassMoumita'r object banalam.

        //Creating the commands by creating alada alada objects for all the concrete implemntation classes

        Command happyModeCommand = new happyModeCommand(receiverObject); //happyModeCommand'er concrete implementation class'er jonno
        //ekta object create korlam, kore receiverObject maane ReceiverClassMoumita'k pathiye dilam as an argument, ei argument'ta
        //land kore happyModeCommand'er constructor "public happyModeCommand(ReceiverClassMoumita obj)" eita'r modhe.

        Command sadModeCommand = new sadModeCommand(receiverObject); //sadModeCommand'er concrete implementation class'er jonno
        //ekta object create korlam, kore receiverObject maane ReceiverClassMoumita'k pathiye dilam as an argument, ei argument'ta
        //land kore sadModeCommand'er constructor "public sadModeCommand(ReceiverClassMoumita obj)" eita'r modhe.

        Command fearModeCommand = new fearModeCommand(receiverObject); //fearModeCommand'er concrete implementation class'er jonno
        //ekta object create korlam, kore receiverObject maane ReceiverClassMoumita'k pathiye dilam as an argument, ei argument'ta
        //land kore fearModeCommand'er constructor "public fearModeCommand(ReceiverClassMoumita obj)" eita'r modhe.


        //Eibar Invoker class mane Moumita'r extraordinary brain'er object banabo.
        MoumitasExtraOrdinaryBrain khubBhaaloBrain = new MoumitasExtraOrdinaryBrain();

        //eibar MoumitaExtraOrdinaryBrain'er object reference variable die ami set korbo command gulo.
        khubBhaaloBrain.setObj(happyModeCommand); //happyModeCommand'k set korlaam.
        //eibar Khub bhaalo brain'ta happyModeCommand'k execute korbe
        khubBhaaloBrain.executeCommand(); //Output: Moumita khub happy karon, Moumita first hoeche


        khubBhaaloBrain.setObj(sadModeCommand); //sadModeCommand'k set korlaam.
        //eibar Khub bhaalo brain'ta sadModeCommand'k execute korbe
        khubBhaaloBrain.executeCommand(); //Output: Moumita khub dukhi karon Moumita'r friend'der sathe Jhogra hoeche

        khubBhaaloBrain.setObj(fearModeCommand); //fearModeCommand'k set korlaam.
        //eibar Khub bhaalo brain'ta fearModeCommand'k execute korbe
        khubBhaaloBrain.executeCommand(); //Output: Moumita khub bhoy'e ache, karon samne 100'ta KUKUR dariye...yikes yikes yikes








        //ITI Program Sampoornaam.....Joy Maa _/\_... babah hapiye gechi

    }
}


