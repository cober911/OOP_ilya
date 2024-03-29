package Seminar5.seminar.cage;

import Seminar5.seminar.animals.Animal;

import java.util.ArrayList;

public interface AnimalCage<T extends Animal> {

    void addAnimalToCage(T animal);

    void giveFoodToCage(int weightOfFood);

    void cleanCage();

    T getAnimalFromCage();
    T getChosenAnimal(int animalParameter);

}
