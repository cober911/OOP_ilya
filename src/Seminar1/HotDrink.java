package Seminar1;

public class HotDrink extends Drink{
    private int temperature;

    public HotDrink(String name, double price, Integer height, int temperature) {
        super(name, price, height);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
    public void consume(){
        System.out.println("Горячий напиток выпит");
    }

    @Override
    public String toString() {
        return "name = " + super.getName() + " volume = " + super.getHeight() + " money = " + super.getPrice() + " temperatura = " + temperature;
    }
}
