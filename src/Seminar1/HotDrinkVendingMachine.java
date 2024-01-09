package Seminar1;

import java.util.ArrayList;

public class HotDrinkVendingMachine extends VendingMachine {
    private ArrayList<HotDrink> HotDrinks;

    public HotDrinkVendingMachine(String firstMachine) {
        super(firstMachine);
        this.HotDrinks = new ArrayList<HotDrink>();
    }

    public void addDrink(HotDrink drink){
        HotDrinks.add(drink);
    }



    public HotDrink getProductByName(String name, double price, int temperature) {
        for (HotDrink product : HotDrinks) {
            if (product instanceof HotDrink) {
                HotDrink ht = (HotDrink) product;
//                if (ht.getName().equals(name) && ht.getPrice() == price && ht.getTemperature() == temperature) {
                    return ht;
//                }
            }
        }
        return null;
    }
}


