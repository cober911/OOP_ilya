package Seminar3.Comparator;

import Seminar3.animals.Animal;
import Seminar3.animals.Wolf;
import Seminar3.cage.WolfCage;

import java.util.ArrayList;
import java.util.Iterator;

public class WolfIterator implements Iterator<Wolf> {
    private ArrayList<Animal> wolfs;
    private int index;

    public WolfIterator(WolfCage wc) {
        this.wolfs = wc.getWolfs();
        this.index = index;
    }

    @Override
    public boolean hasNext() {
        return index < wolfs.size();
    }

    @Override
    public Wolf next() {
        return (Wolf) wolfs.get(index++);
    }
}
