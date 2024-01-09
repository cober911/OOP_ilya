package Seminar2;

import Seminar2.animals.Animal;
import Seminar2.animals.Wolf;
import Seminar2.cage.WolfCage;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        LionCage.setLions(LionsFactory.createLions(2));
//        WolfCage.setWolfs(WolfsFactory.createWolfs(2));
        WolfCage wc = new WolfCage();
        ArrayList<Animal> wolfs = wc.getAnimalCage(wc.getWolfs());
        System.out.println("---------------------");
        wc.feeding(wolfs);
        wc.cleanCage();

    }
}
