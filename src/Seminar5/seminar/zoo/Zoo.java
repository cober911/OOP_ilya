package Seminar5.seminar.zoo;

import Seminar5.seminar.animals.Lion;
import Seminar5.seminar.animals.Snake;
import Seminar5.seminar.animals.Wolf;
import Seminar5.seminar.cage.AnimalCage;

public class Zoo {
    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Lion> LionCage;
    private AnimalCage<Snake> snakeCage;

    public Zoo(AnimalCage<Wolf> wolfCage, AnimalCage<Lion> lionCage, AnimalCage<Snake> snakeCage) {
        this.wolfCage = wolfCage;
        this.LionCage = lionCage;
        this.snakeCage = snakeCage;
    }
}
