package Seminar5.seminar.animalUtils;

import Seminar5.seminar.animals.Animal;

import java.util.ArrayList;
import java.util.Comparator;

public class AnimalUtils {
    public static <T extends Animal> ArrayList<T> sortAnimals(ArrayList<T> animalList){
        animalList.sort(new Comparator<T>() {
            @Override
            public int compare(T animal1, T animal2) {
                return Integer.compare(animal1.getAge(), animal2.getAge());
            }
        });

        return animalList;
    }
}
