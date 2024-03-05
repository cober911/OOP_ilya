package Seminar3.Comparator;

import Seminar3.animals.Lion;

import java.util.Comparator;

public class LionComparator implements Comparator<Lion> {
    @Override
    public int compare(Lion lion1, Lion lion2) {
        return Integer.compare(lion1.getMane(), lion2.getMane());
    }
}
