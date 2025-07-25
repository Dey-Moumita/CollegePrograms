package edu.practise;

public class ExceptionHandlingDemoMain {
    public void divide() throws Exception{
         int num = 10;
         int num2 = 0;
         //try {
             int result = num / num2;
        // } catch (Exception e) {
         //    System.out.println("Exception caught and the cause is "+e.getMessage());
         //}

        System.out.println("Something.....");
    }

     public static void main(String[] args) throws Exception {
        ExceptionHandlingDemoMain obj = new ExceptionHandlingDemoMain();
        obj.divide();
    }
}

