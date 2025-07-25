package edu.practise;

class Parent{
    public Parent(){
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor");
    }
}

class GrandChild extends Child{
    public GrandChild(){
        System.out.println("GrandChild Constructor");
    }
}
public class ConstructorInInheritance {
    public static void main(String[] args) {
        GrandChild grandchild = new GrandChild();
        Child child = new Child();
        Parent parent = new Parent();
    }
}
