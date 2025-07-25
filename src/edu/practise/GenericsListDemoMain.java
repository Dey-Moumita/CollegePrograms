package edu.practise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class GenericsListDemoMain {
    public static void main(String[] args) {
       // List<String> fruits = new ArrayList<>();
        List<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println(fruits);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);

        List<String> fruits2 = new ArrayList<>();
        fruits2.add("apple");
        fruits2.add("orange");
        fruits2.add("mango");
        fruits2.add("guava");
//        fruits.addAll(fruits2);//addAll method call korle sob eksathe concat hye jbe
//        System.out.println(fruits);
//        fruits.addAll(1,fruits2);//ekhane (1,fruits2) mane fruits2 list ta fruits list er 1no. index er por add hbe
//        System.out.println(fruits);
//        fruits2.remove((2));
//       System.out.println(fruits2);
//        fruits.remove("apple");
//        System.out.println(fruits);
//        fruits.removeAll(fruits2);//ekhane amra bracket vetore jei parameter debo setai particularly remove hbe
//        System.out.println(fruits);
//        fruits.clear();//clear method call korle puro list ta clearhye jbe..er vetore amra kono parametere paas korte parbona
//        System.out.println(fruits);
//        System.out.println(fruits2.get(1));
//       fruits2.set(3,"grapes");
//        System.out.println(fruits2);
 //       System.out.println(fruits.size());
 //       System.out.println(fruits2.isEmpty());

 //       System.out.println(fruits2.contains("mango"));

 //       System.out.println(fruits.containsAll(fruits2));
 //       System.out.println(fruits.indexOf("Apple"));
//       System.out.println(fruits2.lastIndexOf("guava"));
 //       System.out.println(fruits2.subList(1,3));
        fruits.retainAll(fruits2);
        System.out.println(fruits);
    }
}
