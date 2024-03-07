package Seminar1;

import java.util.ArrayList;

public class DrinkVendingMachine extends VendingMachine {

    private ArrayList<Drink> drinkList;
>>>>>>> 9327d6e85d8b708a4bf28aea768af570d50ee91c
    public DrinkVendingMachine(String firstMachine) {
        super(firstMachine);
        this.drinkList = new ArrayList<Drink>();
    }

    public void addDrink(Drink drink){
        drinkList.add(drink);
    }

    public Drink getProductByName(String name){
        for(Drink el: drinkList){
            if (el.getName().equals(name)) return el;
        }
        return null;
    }

}

