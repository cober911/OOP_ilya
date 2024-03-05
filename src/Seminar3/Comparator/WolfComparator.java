package Seminar3.Comparator;

import Seminar3.animals.Wolf;

import java.util.Comparator;

public class WolfComparator implements Comparator<Wolf> {
    @Override
    public int compare(Wolf wolf1, Wolf wolf2) {
        return Integer.compare(wolf1.getWeight(), wolf2.getWeight());
    }
}
