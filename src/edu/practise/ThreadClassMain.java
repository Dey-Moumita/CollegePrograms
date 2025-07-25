package edu.practise;
//WAP in Java to demonstrate creation of 2 threads using the thread class & print something
class Mountains extends Thread{
    @Override
    public void run(){
        System.out.println("mountains are looking very beautiful printed by "+Thread.currentThread().getName());
    }
}




public class ThreadClassMain {
    public static void main(String[] args) {
        Mountains obj = new Mountains();
        obj.start();//thread0 is being created over here ,and it is also being instructed to start from here
        Mountains obj1 = new Mountains();
        obj1.start();
        System.out.println("Ladak" + " is printed by "+Thread.currentThread().getName()  );

    }
}
