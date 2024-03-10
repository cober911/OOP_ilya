package Seminar5.seminar.animalUtils;

import Seminar5.seminar.animals.Animal;


import java.util.Collections;
import java.util.List;

public class AnimalUtils {
    public static <T extends Animal> void sortAnimalByAge(List<T> animals) {
        Collections.sort(animals, new AnimalComparator());

    }
}
