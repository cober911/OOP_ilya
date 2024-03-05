package Seminar4.cage;
import Seminar4.animals.Animal;
import Seminar4.animals.Lion;

import java.util.ArrayList;
import java.util.Random;

public class LionCage implements AnimalCage<Lion>{
    private int clean;
    private ArrayList<Lion> lions;

    public LionCage(){
        lions = new ArrayList<>();
    }
    public ArrayList<Lion> getLions(){
        return this.lions;
    }

    public void setLions(ArrayList<Lion> lions) {
        this.lions = lions;
    }

    @Override
    public int addAnimal(Lion animal) {
        return 0;
    }

    @Override
    public ArrayList<Lion> getAnimalCage(ArrayList<Lion> lions) {
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
    public void feeding(ArrayList<Lion> lions) {
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

    @Override
    public ArrayList<Lion> sortByAge(ArrayList<Lion> animalList) {
        return AnimalCage.super.sortByAge(animalList);
    }

}
