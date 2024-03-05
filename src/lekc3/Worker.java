package lekc3;

import java.util.Iterator;

public class Worker implements Iterator<String> {

    public String firstname;
    public String lastname;
    public int age;
    public int salary;
    int index;

    public Worker(String firstname, String lastname, int age, int salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d", firstname, lastname, age, salary);
    }

    @Override
    public boolean hasNext() {
        return index++ < 4;
    }

    @Override
    public String next() {
        switch (index){
            case 1:
                return String.format("firsname: %s", firstname);
            case 2:
                return String.format("lasname: %s", lastname);
            case 3:
                return String.format("age: %d", age);
            default:
                return String.format("salary: %d", salary);
        }
    }
}
