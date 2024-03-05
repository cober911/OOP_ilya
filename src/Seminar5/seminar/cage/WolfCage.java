package Seminar5.seminar.cage;

import Seminar5.seminar.animals.Animal;
import Seminar5.seminar.animals.Wolf;

import java.util.ArrayList;
import java.util.Random;

public class WolfCage implements AnimalCage<Wolf> {
    private int clean;
    private final ArrayList<Wolf> wolfs;

    public WolfCage() {
        wolfs = new ArrayList<>();
    }

    public ArrayList<Wolf> getWolfs() {
        return this.wolfs;
    }

    @Override
    public int addAnimal(Wolf animal) {
        return 0;
    }

    @Override
    public ArrayList<Wolf> getAnimalCage(ArrayList<Wolf> wolfs) {
        Random rnd = new Random();
        for (int i = 0; i < 4; i++) {
            wolfs.add(new Wolf(rnd.nextInt(13+1), 35, 4));
        }
        for (Animal animal: wolfs) {
            System.out.println(animal);
        }
        int randomIndex = rnd.nextInt(wolfs.size());
        Animal randomElement = wolfs.get(randomIndex);
        System.out.println("Случайный волк: " + randomElement); // Вытвскивает рандомного волка
        return wolfs;
    }


    @Override
    public void feeding(ArrayList<Wolf> wolfs) {
        Random rnd = new Random();
        for (Animal animal: wolfs) {
            var value = rnd.nextInt(120) + animal.getWeight();
            if(value < animal.getMaxWeight() ) {
                animal.setWeight(value);
                System.out.println(animal + "Покормлен");
            }
            else {
                System.out.println(animal + "У волка в жопе перегруз. Макс. вес: 100, а он " + value);
            }
        }
    }

    @Override
    public int cleanCage() {
        System.out.println("Клетка очищена");
        return 0;
    }
}
