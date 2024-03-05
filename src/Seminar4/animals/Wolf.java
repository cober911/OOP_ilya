package Seminar4.animals;

public class Wolf extends Animal{
    private static final int MAX_WEIGHT = 100;
    private static final String TYPE = "Wolf";
    public Wolf(int age, int weight, int limbs) {
        super(age, weight, limbs);
    }


    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "Wolf " + "age=" + age + ", weight=" + weight + ", limbs=" + limbs + " \n";
    }
}
