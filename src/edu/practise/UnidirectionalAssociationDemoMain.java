package edu.practise;

class Address{
    String city, state;
    public Address(String city,String state){
        this.city = city;
        this.state = state;
    }
    public void display(){
        System.out.println(city + " ," + state);
    }
}
class Person{
    String name; Address address;
    public Person(String name,Address address){
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.print("Address: " );
        address.display();
    }
}
public class UnidirectionalAssociationDemoMain {
    public static void main(String[] args) {
        Person person = new Person("Mou",new Address ("Kolkata","WB"));
        person.display();

    }
}
