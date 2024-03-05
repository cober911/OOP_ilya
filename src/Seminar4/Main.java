package Seminar4;

import Seminar4.animalUtils.AnimalUtils;
import Seminar4.animals.Animal;
import Seminar4.animals.Lion;
import Seminar4.animals.Wolf;
import Seminar4.cage.LionCage;
import Seminar4.cage.WolfCage;
import Seminar4.factory.LionsFactory;


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
