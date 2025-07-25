package edu.practise;

abstract class Excellent{
    Excellent(){
        System.out.println("Excellent");
    }
    void subject(){//concrete method
        System.out.println("Excellent subject");
    }
    abstract void subject2();//abstract method
}

class Normal extends Excellent{

    @Override
    void subject2() {
        System.out.println("JAVA");
    }
}
public class AbstractDemoMain {
    public static void main(String[] args) {
       // Excellent e = new Excellent();//it's totally wrong bcz abstract class can not have an object
           //Normal n1 = new Normal();
           Excellent n1 = new Normal();
    }
}
