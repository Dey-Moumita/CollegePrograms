package edu.practise;

class Parent1{
    Parent1(){
        System.out.println("Non-Parameterised of Parent1");
    }
    Parent1(int x){
        System.out.println("Parameterised of Parent1");
    }
}

class Child1 extends Parent1{
    Child1(){
        System.out.println("Non-Parameterised of Child1");
    }
    Child1(int y){
        System.out.println("Parameterised of Child1");
    }
    Child1(int x,int y){
        super(x);//super should be the first line of any method
        System.out.println("2 parameterised of Child1");
    }
}
public class ParameterisedConstructorInInheritance {
    public static void main(String[] args) {
       // Child1 child1 = new Child1();
       // Child1 child1 = new Child1(10);
        Child1 child1 = new Child1(10,20);
        Parent1 parent1 = new Parent1();
    }
}
