package edu.practise;

import java.util.Objects;

class XYZ{
    private int age; private String name;

    public XYZ(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        XYZ xyz = (XYZ) o;
        return age == xyz.age && Objects.equals(name, xyz.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}

public class EqualsContractDemoMain {
    public static void main(String[] args) {
        XYZ obj = new XYZ(21,"Moumita");
        XYZ obj2 = new XYZ(21,"Moumita");
        System.out.println(obj.equals(obj2));
        System.out.println(obj==obj2);


    }
}
