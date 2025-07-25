package edu.practise;

class Mou implements Runnable{

    @Override
    public void run() {//ekhane run method take override krechi karon Runnable ekta interface ar interface er vetore
        //by default sob method abstruct or public thake..to abstruct method ke remove krar jonno amra override krechi run method ke
//        try{
//            Thread.sleep(100);
//        } catch (InterruptedException e) {//ekhane InterruptedException ekta datatype ar e ekta variable
//            System.out.println("Thread0 has been interrupted");
//        }
        for (int i = 0; i<100;i++){
            System.out.println((i+1)+" Printing....... printed by "+Thread.currentThread().getName());
        }

    }
}


public class DemonstratingDemonThreadMain {
    public static void main(String[] args) {
        Mou obj = new Mou();
        Thread thread0 = new Thread(obj);
       //thread0.setDaemon(true);
        thread0.interrupt();
        thread0.start();
        System.out.println("Done... printed by "+Thread.currentThread().getName());
    }
}
