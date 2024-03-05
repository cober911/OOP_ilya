package lekc3;

import java.util.*;

public class Program {
    public static void main(String[] args) {
//        --------Iterator---------
        Worker worker = new Worker("Имя", "Фамилия", 34, 3532);
        Iterator<String> components = worker;
        while (components.hasNext()) {
            System.out.println(worker.next());
        }

//        --------Iterable---------
//        Coffee latte = new Coffee();
//        latte.addComponent(new Water("Вода"));
//        latte.addComponent(new Beans("Зерна"));
//        latte.addComponent(new Milk("Молоко"));
//
//        for (var ingredient: latte) {
//            System.out.println(ingredient);
//        }

//        Comparable
//        Random r = new Random();
//        List<Worker_Comparable> db = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            db.add(new Worker_Comparable("name" + i, "firs name" + i, r.nextInt(18,25), r.nextInt(10000)));
//        }
//        System.out.println(db);
//        Collections.sort(db);
//        System.out.println(db);

//        Comparator
//        db.sort(new SalaryComparator());
//
//        System.out.println(db);
        }
    }