package Seminar1.Alex.Machines;


import Seminar1.Alex.Product.Drink;

public class DrinkMachine<T extends Drink> extends WendingMachine<T> {
    public DrinkMachine(String drinkMachine) {
        super(drinkMachine);
    }

}
