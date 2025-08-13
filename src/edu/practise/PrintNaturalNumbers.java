package edu.practise;

public class PrintNaturalNumbers {
    public static void main(String[] args) {
        int i=1;
        int sum =0;

        do{
            sum = sum +i;//0+1 =0 //1+2=3//3+3=6//6+4=10//10+5=15
            i++;//1++//2++//3++//4++//5++
        }while(i<=5);//2<5//3<5//4<5//5<=5//6<==5(false)
        System.out.println(sum);//15
    }
}


//        do{
//          int sum =0;
//          sum = sum +i;
//           i++;
//        }while(i<=5);
//        System.out.println(sum);//ekhane compile time error asbe.WHY?
//        bcz sum variable ta initialize hyeche loop er vetor r sesh hyeche loop er vetor tai print sum je royeche seta bujte parchena what's the sum here

