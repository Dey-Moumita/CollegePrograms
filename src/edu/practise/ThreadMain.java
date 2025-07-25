package edu.practise;

class Moumita implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello id printed by "+Thread.currentThread().getName());
    }
}





public class ThreadMain {
    public static void main(String[] args) {
        Moumita obj = new Moumita();
        Thread th1 = new Thread(obj);
        th1.start();
        //Thread th2 = new Thread(obj);
        Thread th2 = new Thread(obj,"mou");
        th2.start();
        System.out.println("Thank you is printed by "+Thread.currentThread().getName());
    }

}
