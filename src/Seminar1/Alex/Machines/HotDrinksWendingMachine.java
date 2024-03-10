package Seminar1.Alex.Machines;

import Seminar1.Alex.Product.HotDrink;

public class HotDrinksWendingMachine<T extends HotDrink> extends WendingMachine<T> {

    public HotDrinksWendingMachine(String hotDrinkMachineName){
        super(hotDrinkMachineName);
    }

}
