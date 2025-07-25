package edu.practise;

class Chocolates <M>{//M erer jaigai amra ja khusi nite pari like A,B,C etc//here we can create our own generic class
    private  M item;//int x mane jerokom x holo integer typ er ekhane item ti M typ er
    public void set( M item){
        this.item = item;
    }
    public M get(){
        return item;
    }
}

public class GenericDemoMain {
    public static void main(String[] args) {
        Chocolates<String> reference = new Chocolates<>();
        reference.set("Milk Chocolate");
        System.out.println(reference.get());
    }
}
