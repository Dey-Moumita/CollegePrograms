package edu.practise;


class Counter implements Runnable{
    private int value = 0;
    public void increment(){
        try{
            Thread.sleep(20);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        value++;
    }
    public void decrement(){
        value--;
    }
    public int getValue(){
        return value;
    }

    @Override
    public void run() {
        synchronized (this){
            this.increment();
            System.out.println(Thread.currentThread().getName() + " increment : " +this.getValue());
            this.decrement();
            System.out.println(Thread.currentThread().getName() + " decrement : " +this.getValue());

        }

    }
}





public class SynchronisationDemoMain {
    public static void main(String[] args) {
        Counter counter = new Counter();
//        Thread obj1 = new Thread(counter);
//        obj1.start();
        new Thread(counter).start();//anonymous object
        new Thread(counter).start();
        new Thread(counter).start();
        new Thread(counter).start();
    }
}
