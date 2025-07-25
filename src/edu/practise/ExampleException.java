package edu.practise;



public class ExampleException  extends Exception{
    public ExampleException(String message){
        super(message); //sending the message to super class Exception
    }
}

class Janina{

    public void display(int age) throws ExampleException{//throws  always method signature e use hoi
        if (age<18){
            throw new ExampleException("Cars not allowed to drive");
        }
        else{
            System.out.println("Cars allowed to drive");
        }
    }
}

class Test{
    public static void main(String[] args) {
        Janina obj = new Janina();
        try {
            obj.display(17);
        } catch (ExampleException e) {
            System.out.println(e.getMessage());
        }
    }
}
