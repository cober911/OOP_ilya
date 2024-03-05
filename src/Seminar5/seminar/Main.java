package Seminar5.seminar;

import Seminar5.seminar.animalUtils.AnimalUtils;
import Seminar5.seminar.animals.Animal;
import Seminar5.seminar.animals.Lion;
import Seminar5.seminar.animals.Wolf;
import Seminar5.seminar.cage.LionCage;
import Seminar5.seminar.cage.WolfCage;
import Seminar5.seminar.factory.LionsFactory;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        LionCage.setLions(LionsFactory.createLions(2));
//        WolfCage.setWolfs(WolfsFactory.createWolfs(2));

//        WolfCage wc = new WolfCage();
//        ArrayList<Wolf> wolfs = wc.getAnimalCage(wc.getWolfs());
//        System.out.println("---------------------");
//        wc.feeding(wolfs);
//        wc.cleanCage();
        LionCage lionCage = new LionCage();
        lionCage.setLions(LionsFactory.createLions(4));
        System.out.println(lionCage.getLions());
        AnimalUtils.sortAnimals(lionCage.getLions());
        System.out.println("---------------------");
        System.out.println(lionCage.getLions());
    }
}
