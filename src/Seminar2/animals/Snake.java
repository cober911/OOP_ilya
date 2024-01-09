package Seminar2.animals;

public class Snake extends Animal {
    private int length;
    private static final int MAX_WEIGHT = 10;
    private static final String TYPE = "Snake";

    public Snake(int age, int weight, int limbs, int length) {
        super(age, weight, limbs);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String getType() {
        return TYPE;
    }

}
