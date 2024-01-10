package lekc3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Worker worker = new Worker("Имя", "Фамилия", 34,3532);
        Iterator<String> components = worker;
        while (components.hasNext()){
            System.out.println(worker.next());
        }
    }
}
