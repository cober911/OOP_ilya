package Seminar5.seminar.factory;

import Seminar5.seminar.animals.Wolf;

import java.util.ArrayList;
import java.util.Random;

public class WolfsFactory {
    static Random rnd = new Random();
    public static ArrayList<Wolf> createWolfs(int wolfCount) {
        ArrayList wolfs = new ArrayList<>();
        for (int i = 0; i < wolfCount; i++) {
            wolfs.add(new Wolf(rnd.nextInt(13)+1, rnd.nextInt(130)+1, 4));
        }
        return wolfs;
    }
}
