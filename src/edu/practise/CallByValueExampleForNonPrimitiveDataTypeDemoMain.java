package edu.practise;

class GetData{
    public int num1, num2;

    public GetData(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}

public class CallByValueExampleForNonPrimitiveDataTypeDemoMain {

    public void add(GetData obj){
        obj.num1 = 10; obj.num2 = 20;
        int result = obj.num1 + obj.num2;
        System.out.println("Inside of add method: "+result);
    }

    public static void main(String[] args) {
        int num1 = 5, num2= 6;
        GetData obj = new GetData(num1,num2);

        CallByValueExampleForNonPrimitiveDataTypeDemoMain object = new
                CallByValueExampleForNonPrimitiveDataTypeDemoMain();

        object.add(obj);

        System.out.println("Inside main method: "+(obj.num1+obj.num2));
    }
}  