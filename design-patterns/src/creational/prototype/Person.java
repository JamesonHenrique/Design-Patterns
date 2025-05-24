package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Person implements Prototype{
    private String name;
    private double age;
    private final List<Address> address = new ArrayList<>();

    public Person(String name, double age) {
        this.name = name;
        this.age = age;
    }
    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }
    public void addAddress(Address address) {
        this.address.add(address);
    }

    @Override
    public Person clone() {
        Person clonedPerson = new Person(this);
        for (Address addr : this.address) {
            clonedPerson.addAddress(addr.clone());
        }
        return clonedPerson;
    }

    public List<Address> getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", address=" + address + "}";
    }
}
