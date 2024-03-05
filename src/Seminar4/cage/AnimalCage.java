package Seminar4.cage;

import Seminar4.animals.Animal;

import java.util.*;

public interface AnimalCage<T extends Animal> {
    int addAnimal(T animal);
    ArrayList<T> getAnimalCage(ArrayList<T> animals);
    void feeding(ArrayList<T> animals); //Реализовать механизм кормления

    int cleanCage(); //Реализовать механизм очистки клетки
    default ArrayList<T> sortByAge(ArrayList<T> animalList){ // Сортировка животных по возрасту
        animalList.sort(new Comparator<T>() {
            @Override
            public int compare(T animal1, T animal2) {
                return Integer.compare(animal1.getAge(), animal2.getAge());
            }
        });
        return animalList;
    }

}
