package Seminar2.animals;

public class Lion extends Animal {
    private int mane;
    private static final int MAX_WEIGHT = 300;
    private static final String TYPE = "Lion";

    public Lion(int age, int weight, int limbs, int mane) {
        super(age, weight, limbs);
        this.mane = mane;
    }


    public int getMane() {
        return mane;
    }

    public void setMane(int mane) {
        this.mane = mane;
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
        return "Lion " + "age=" + age + ", weight=" + weight + ", limbs=" + limbs + ", mane=" + mane + "] \n";
    }
}
