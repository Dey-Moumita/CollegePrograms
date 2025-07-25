package edu.practise;

class Examine{
    public int max(int a,int b){
        return a>b? a:b;
    }
    public int max(int a,int b,int c){
        if(a>b && a>c) return a;
        else if(b>c)   return b;
        return c;
    }
}
public class MethodOverloadingDemoMain {
    public static void main(String[] args) {
        Examine examine = new Examine();
        System.out.println("The output of the 1st one is: " +examine.max(10,5));
        System.out.println("The output of the 2nd one is: " +examine.max(10,15,5));

    }
}
