package edu.practise;



public class CallByValueExampleForPrimitiveDataTypeDemoMain {
    public void add(int num1, int num2){
        num1= 7;
        num2=8;
        int result = num1+num2;
        System.out.println("Adding inside add method: "+result);
    }

    public static void main(String[] args) {
        CallByValueExampleForPrimitiveDataTypeDemoMain obj = new CallByValueExampleForPrimitiveDataTypeDemoMain();
        int num1 =5, num2=6;
        obj.add(num1,num2);
        System.out.println("Adding inside main method: "+(num1+num2));
    }
}
