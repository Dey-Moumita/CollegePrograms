package edu.practise;

class Mother {
    public void display(){
        System.out.println("ja khusi");
    }
}
class Moumita1 extends Mother{
    @Override
    public void display(){
        System.out.println("mou");
    }
}




public class MethodOverriddingExampleMain {
    public static void main(String[] args) {
        Moumita1 obj = new Moumita1();
        obj.display();
       // new Moumita().display();//anonymous object
    }
}
