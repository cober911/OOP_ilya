package Seminar3.cage;

import Seminar3.Comparator.WolfComparator;
import Seminar3.Comparator.WolfIterator;
import Seminar3.animals.Animal;
import Seminar3.animals.Wolf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class WolfCage implements AnimalCage, Iterable<Wolf> {
    private int clean;
    private ArrayList wolfs;

    public WolfCage() {
        wolfs = new ArrayList<>();
    }

    public ArrayList getWolfs(ArrayList<Wolf> wolfs) {
        return this.wolfs;
    }

    public void setWolfs(ArrayList wolfs) {
        this.wolfs = wolfs;
    }

    @Override
    public ArrayList<Animal> getAnimalCage(ArrayList<Animal> wolfs) {
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
    public int addAnimal(Animal animal) {
        wolfs.add(animal);
        return wolfs.size();
    }

    public ArrayList<Animal> getWolfs() {
        return wolfs;
    }

    @Override
    public void feeding(ArrayList<Animal> wolfs) {
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

    @Override
    public Iterator<Wolf> iterator() {
            return new WolfIterator(this);
    }

    public void wolfInterator(){
        wolfs.sort(new WolfComparator());
        System.out.println(wolfs);
    }
}
