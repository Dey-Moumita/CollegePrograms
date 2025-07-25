package edu.practise;

class MyThreadNew extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started.");
        try {//try is a special block;
            // try jei type  error through korbe sei type  error take catch block e catch krte hbe
            Thread.sleep(2000); // Simulate some work for 2 seconds
        } catch (InterruptedException e) {
            //ekhane e holo InterruptedException typ er variable;Exception hochhe mother class ;InterupptedException hochhe subclass
            //sudhu Exception dileo eta work korbe karon Exception hocche mother class tai sbkichu access korte parbe
            e.printStackTrace();
            System.out.println(Thread.currentThread().getName() + " finished.");
        }
    }
}

    public class BasicJoinExampleDemoMain {
        public static void main(String[] args) {
            MyThreadNew thread1 = new MyThreadNew();
            MyThreadNew thread2 = new MyThreadNew();

            thread1.start(); // Start thread1
            thread2.start(); // Start thread2

            try {
                // Wait for thread1 to complete
                thread1.join();
                System.out.println("Thread 1 has finished. Resuming main thread.");

                // Wait for thread2 to complete
                thread2.join();
                System.out.println("Thread 2 has finished. Resuming main thread.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Main thread execution completed.");
        }
    }






