package edu.practise;

class Super{
    void play(){
        System.out.println("play football");
    }
    void food(){
        System.out.println("Make Prawn Curry");
    }
}

class Sub extends Super{
    void place(){
        System.out.println("Mountain");
    }
    void food(){
        System.out.println("Biriyani");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args){
        Super s = new Sub();
        s.food();//jar object create hbe tar method ke call hbe

    }
}
