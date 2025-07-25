package edu.practise;

class Chocolate extends Thread{
    @Override
    public void run(){
        System.out.println("chocolate is good and printed by "+Thread.currentThread().getName());
    }
}


public class RunningThreadsUsingThreadClassDemoMain {
    public static void main(String[] args) {
        Chocolate obj = new Chocolate();
        obj.start();
        System.out.println("Chocolate is good but should be consumed in limitations printed by "+Thread.currentThread().getName());
    }
}
