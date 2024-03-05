package Seminar1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        VendingMachine firstMashine = new VendingMachine("first machine");
        Product shokolad =  new Product("шоколад", 50);
        Product chipsy =  new Product("Чипсы", 100);
//        firstMashine.addProduct(shokolad);
//        firstMashine.addProduct(chipsy);
        Drink soke = new Drink("Сок",23,100);
        Drink water = new Drink("Вода",10,50);
//        DrinkVendingMachine firstDrinkMashine = new DrinkVendingMachine("second mashine");
//        firstDrinkMashine.addDrink(soke);
//        firstDrinkMashine.addDrink(water);

        ArrayList<Product> products = new ArrayList<>();
        products.add(soke);
        products.add(water);
        products.add(shokolad);
        products.add(chipsy);
        for (Product el: products){
            el.consume();
        }
    }
}
