package lekc3;

public class Worker_Comparable implements Comparable<Worker_Comparable> {
    public String firstname;
    public String lastname;
    public int age;
    public int salary;
    int index;

    public Worker_Comparable(String firstname, String lastname, int age, int salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return String.format("\n%s %s %d %d", firstname, lastname, age, salary);
    }


    @Override
    public int compareTo(Worker_Comparable o) {
        return Integer.compare(this.salary, o.salary);
    }
}
