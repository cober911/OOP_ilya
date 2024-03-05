package Seminar5.seminar.animals;

public abstract class Animal {
    protected int age;
    protected int weight;
    protected int limbs;

    public Animal(int age, int weight, int limbs) {
        this.age = age;
        this.weight = weight;
        this.limbs = limbs;
    }
    public Animal(){

    }

    public int getAge() {
        return age;
    }

    public abstract int getMaxWeight();

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract String getType();

    public int getWeight() {
        return weight;
    }

    public void feed(int foodWeight) {
        if (foodWeight + this.weight <= getMaxWeight()) {
            this.weight += foodWeight;
            System.out.print(foodWeight);
        } else System.out.println("Вес максимальный");
    }


    @Override
    public String toString() {
        return "Animal" + "age=" + age + ", weight=" + weight + ", limbs=" + limbs + "] \n";
    }
}