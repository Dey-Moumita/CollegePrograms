package edu.practise;

class Address1{
    String city,state;
    Person1 person;
    Address1(String city,String state){
        this.city= city;
        this.state =state;
    }
    void setPerson(Person1 person){
        this.person = person;
    }
    void display(){
        System.out.println("City: " + city+  " State: " +state );
        System.out.println("Belongs to " +person.name);
    }
}
class Person1{
    String name;Address1 address;
    public Person1(String name){
        this.name = name;
    }
    void setAddress(Address1 address){
        this.address = address;
        address.setPerson(this);
    }
    void display(){
        System.out.println("Name : " +name);
        System.out.print("Lives in: ");
        address.display();
    }
}
public class BidirectionalAssociationDemoMain {
    public static void main(String[] args){
        Person1 person = new Person1("Mou");
        Address1 address = new Address1("Kolkata","WB");
        person.setAddress(address);
        person.display();

    }
}
