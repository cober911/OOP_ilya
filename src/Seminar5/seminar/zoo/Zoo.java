package Seminar5.seminar.zoo;

import Seminar5.seminar.animals.Lion;
import Seminar5.seminar.animals.Snake;
import Seminar5.seminar.animals.Wolf;
import Seminar5.seminar.cage.AnimalCage;
import Seminar5.seminar.cage.LionCage;

import java.util.ArrayList;

public class Zoo {
    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Lion> lionCage;
    private AnimalCage<Snake> snakeCage;


    public Zoo(AnimalCage<Wolf> wolfCage, AnimalCage<Lion> lionCage, AnimalCage<Snake> snakeCage) {
        this.wolfCage = wolfCage;
        this.lionCage = lionCage;
        this.snakeCage = snakeCage;
    }

    public Lion getLion(){
        return this.lionCage.getAnimalCage(new LionCage().getLions());
    }
    public Lion createLions(int lionsCount){return this.lionCage.getAnimalCage(new LionCage().createAnimal(lionsCount));}

}
