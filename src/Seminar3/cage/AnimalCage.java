package Seminar3.cage;

import Seminar3.animals.Animal;

import java.util.ArrayList;

public interface AnimalCage {
    ArrayList<Animal> getAnimalCage(ArrayList<Animal> animals);
    int addAnimal(Animal animal);
    void feeding(ArrayList<Animal> animals); //Реализовать механизм кормления
    int cleanCage(); //Реализовать механизм очистки клетки

}
