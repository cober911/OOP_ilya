package Seminar4.zoo;

import Seminar4.animals.Lion;
import Seminar4.animals.Snake;
import Seminar4.animals.Wolf;
import Seminar4.cage.AnimalCage;

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
