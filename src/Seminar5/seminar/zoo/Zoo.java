package Seminar5.seminar.zoo;

import Seminar5.seminar.animals.Lion;
import Seminar5.seminar.animals.Snake;
import Seminar5.seminar.animals.Wolf;

import Seminar5.seminar.cage.LionCage;
import Seminar5.seminar.cage.SnakeCage;
import Seminar5.seminar.cage.WolfCage;


public class Zoo {
    private WolfCage wolvesCage;
    private LionCage lionsCage;
    private SnakeCage snakesCage;

    public Zoo(LionCage lionsCage,WolfCage wolvesCage, SnakeCage snakesCage) {
        this.wolvesCage = wolvesCage;
        this.lionsCage = lionsCage;
        this.snakesCage = snakesCage;
    }

    public Lion takeOffLion(int lionMane){
        return this.lionsCage.getChosenAnimal(lionMane);
    }

    public Wolf takeOffWolf(int wolfAngry){
        return this.wolvesCage.getChosenAnimal(wolfAngry);

    }

    public Snake takeOffSnake(int snakeLength){
        return this.snakesCage.getChosenAnimal(snakeLength);
    }


    public void addLion(Lion lion){
        this.lionsCage.addAnimalToCage(lion);
        System.out.println("В зоопарк в клетку со львами добавлен"+" "+lion+"\n");
    }

    public void addWolf(Wolf wolf){
        this.wolvesCage.addAnimalToCage(wolf);
        System.out.println("В зоопарк в клетку с волками добавлен"+" "+wolf+"\n");
    }

    public void addSnake(Snake snake){
        this.snakesCage.addAnimalToCage(snake);
        System.out.println("В зоопарк в клетку со змеями добавлен"+" "+snake+"\n");
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "wolvesCage=" + wolvesCage +"\n"+
                ", lionsCage=" + lionsCage +"\n"+
                ", snakesCage=" + snakesCage +
                '}';
    }
}
