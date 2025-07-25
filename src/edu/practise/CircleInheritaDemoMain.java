
package edu.practise;
class Circle{
    private double radius;
    public Circle (){
        radius = 3.5;
    }
    public double getarea(){
        return 3.14*radius*radius;
    }
}

class Cylinder extends Circle {
    private double height;
    public Cylinder(){
        height = 4.7;
    }
    public double getvolume(){
        return getarea()*height;
    }
}

public class CircleInheritaDemoMain {
    public static void main(String[] args){
        Circle circle = new Circle();
        System.out.println("The area of the circle " +circle.getarea());
        //Cylinder cylinder = new Cylinder();
        //System.out.println("The volume of the cylinder " +cylinder.getvolume());
        System.out.println("The volume of the cylinder " +new Cylinder().getvolume());
    }
}