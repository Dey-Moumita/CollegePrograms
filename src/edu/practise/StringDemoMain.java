package edu.practise;

public class StringDemoMain {
    public static void main(String[] args) {
        char[] arr = {'M','O','U'};
        String charArrayToString = new String(arr);
        System.out.println(charArrayToString);

        StringDemoMain obj = new StringDemoMain();
        StringDemoMain obj2 = new StringDemoMain();
       // obj = obj2;
        //System.out.println(obj==obj2);
//        if (obj == obj2){
//            System.out.println("true");
//        }
//        else {
//            System.out.println("false");
//        }

        String value = (obj==obj2)?"true":"false";
        System.out.println(value);
    }
}
