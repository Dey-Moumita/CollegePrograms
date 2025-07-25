package edu.practise;

class A{
    public void Mountains(){
        System.out.println("Mountains are looking just amazing");
    }
}
class B extends A{
    @Override
    public void Mountains(){
        System.out.println("Hills mean heaven");
    }
}

public class DynamicBindingDemoMain {
    public static void main(String[] args){
        A obj = new B();//ekhane class A er reference niye class B er object create kora hoyeche
        obj.Mountains();//jei class er object create kora hobe sei class er method call hobe
    }
}
