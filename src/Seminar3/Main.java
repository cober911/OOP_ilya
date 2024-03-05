package Seminar3;

import Seminar3.animals.Animal;
import Seminar3.animals.Lion;
import Seminar3.animals.Wolf;
import Seminar3.cage.LionCage;
import Seminar3.cage.WolfCage;
import Seminar3.factory.LionsFactory;
import Seminar3.factory.WolfsFactory;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        LionCage lionCage = new LionCage();
////        ArrayList<Animal> lions = lionCage.getAnimalCage(lionCage.getLions()); // Вытаскиваем льва из клетки
//        lionCage.setLions(LionsFactory.createLions(4)); //Содаем львов
//        System.out.println(lionCage.getLions());
        System.out.println("---------------------");
//        Comparable
//        lionCage.sortLions();
//        Comparator
//        lionCage.lionComparator();
//        -------Wolf Iterable Iterator----------------
        WolfCage wolfCage = new WolfCage();
        wolfCage.setWolfs(WolfsFactory.createWolfs(4));
        System.out.println(wolfCage.getWolfs());
        System.out.println("---------------------");
//        for (Wolf wolf: wolfCage) {
//            System.out.println(wolf);
//        }
//        -------Wolf Comparetor---------------
        wolfCage.wolfInterator();
    }
}
