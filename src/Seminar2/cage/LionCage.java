package Seminar2.cage;
import Seminar2.animals.Animal;
import Seminar2.animals.Lion;

import java.util.ArrayList;
import java.util.Random;

public class LionCage implements AnimalCage{
    private int clean;
    private ArrayList lions;

    public LionCage(){
        lions = new ArrayList<>();
    }
    public ArrayList getLions(){
        return this.lions;
    }

    @Override
    public ArrayList getAnimalCage(ArrayList<Animal> lions) {
        Random rnd = new Random();
        for (int i = 0; i < 4; i++) {
            lions.add(new Lion(rnd.nextInt(13+1), 100, 4,343));
        }
        System.out.println(lions);
        int randomIndex = rnd.nextInt(lions.size());
        Animal randomElement = lions.get(randomIndex);
        System.out.println("Случайный лев: " + randomElement); // Вытвскивает рандомного льва
        return null;
    }


    @Override
    public int addAnimal(Animal animal) {
        lions.add(animal);
        return lions.size();
    }

    @Override
    public void feeding(ArrayList<Animal> lions) {
        Random rnd = new Random();
        for (Animal animal: lions) {
            var value = rnd.nextInt(300) + animal.getWeight();
            if(value < animal.getMaxWeight() ) {
                animal.setWeight(value);
                System.out.println(animal + "Покормлен");
            }
            else {
                System.out.println(animal + "У льва в жопе перегруз. Макс. вес: 300, а он " + value);
            }
        }
    }

    @Override
    public int cleanCage() {
        System.out.println("Клетка очищена");
        return 0;
    }

}
