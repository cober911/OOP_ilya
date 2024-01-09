package Seminar1;

import java.util.ArrayList;

public class HotDrinkMain {
    public static void main(String[] args) {
        HotDrinkVendingMachine HotMashine = new HotDrinkVendingMachine("firstname");
        HotDrink napitok_1 = new HotDrink("coffe",220,320,120);
        HotDrink napitok_2 = new HotDrink("tea",150,300,100);
        Drink soke = new Drink("Сок",23,100);
        Drink water = new Drink("Вода",10,50);
        Product shokolad =  new Product("шоколад", 50);
        Product chipsy =  new Product("Чипсы", 100);

        ArrayList<Product> products = new ArrayList<>();
        products.add(napitok_1);
        products.add(napitok_2);
        products.add(soke);
        products.add(water);
        products.add(shokolad);
        products.add(chipsy);

        for (Product el: products){
            el.consume();
            System.out.println(el.toString() + "\n");

        }
    }
}

