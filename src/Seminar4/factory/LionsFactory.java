package Seminar4.factory;

import Seminar4.animals.Lion;

import java.util.ArrayList;

public class LionsFactory{

    public static ArrayList<Lion> createLions(int lionCount) {
        ArrayList<Lion> lions = new ArrayList<>();
        for (int i = 0; i < lionCount; i++) {
            lions.add(new Lion((int)(Math.random()*13+1), (int)(Math.random()*150+1), 4, (int)(Math.random()*200+1)));
        }
        return lions;
    }

}
