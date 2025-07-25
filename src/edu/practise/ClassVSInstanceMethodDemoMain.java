package edu.practise;

class Techno{
    public static void display(){
        System.out.println("T-I-B");
    }
}

public class ClassVSInstanceMethodDemoMain {
    public static void main(String[] args) {
//        Techno obj = new Techno();
//        obj.display();
        Techno.display();//since the display method is in another class that is Techno, we won't be able to call the
        //display() directly, we need to take the reference of the class where the display() method is present. So we
        //call it by mentioning Techno.display();
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
        Thread.currentThread().setName("fhefdgeug");
        System.out.println(Thread.currentThread().getName());
        System.out.println("Priority = "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(8);
        System.out.println("NEW Priority = "+Thread.currentThread().getPriority());

    }
}
