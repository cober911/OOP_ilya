package Seminar4.cage;

import Seminar4.animals.Animal;
import Seminar4.animals.Snake;

import java.util.ArrayList;

public class SnakeCage implements AnimalCage<Snake> {
    @Override
    public int addAnimal(Snake animal) {
        return 0;
    }

    @Override
    public ArrayList getAnimalCage(ArrayList<Snake> animals) {
        return null;
    }

    @Override
    public void feeding(ArrayList<Snake> animals) {

    }

    @Override
    public int cleanCage() {
        return 0;
    }
}
