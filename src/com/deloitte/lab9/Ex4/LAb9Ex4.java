package com.deloitte.lab9.Ex4;
import java.util.function.Supplier;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class LAb9Ex4 {
	
	public static void main(String[] args) {
        Supplier<Person> personSupplier = () -> createPerson("Maxi", 180);

        Person person = personSupplier.get();

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
	public static Person createPerson(String name, int age) {
        return new Person(name, age);
    }

    

}
