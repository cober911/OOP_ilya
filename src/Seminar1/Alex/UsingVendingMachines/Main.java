package Seminar1.Alex.UsingVendingMachines;

import Seminar1.Alex.Machines.DrinkMachine;
import Seminar1.Alex.Machines.HotDrinksWendingMachine;
import Seminar1.Alex.Machines.WendingMachine;
import Seminar1.Alex.Product.Drink;
import Seminar1.Alex.Product.HotDrink;
import Seminar1.Alex.Product.Product;


public class Main {
    public static void main(String[] args) {
        WendingMachine wendMachine = new WendingMachine("Father Vending machine");
        wendMachine.addProduct(new Product("орешки", 100));
        wendMachine.addProduct(new Product("газировка", 150));

//        String newStr = wendMachine.returnProduct("орешки").getName();
//        Integer newPrice = wendMachine.returnProduct("орешки").getPrice();
//        System.out.println(newPrice+" "+newStr);
        DrinkMachine drinkVM = new DrinkMachine("напитки");
        Drink appleJuiceDrink = new Drink("сок яблоко", 100);
        appleJuiceDrink.setVolume(100);
        Drink cherryJuiceDrink = new Drink("сок вишня", 150);
        cherryJuiceDrink.setVolume(150);
        drinkVM.addProduct(appleJuiceDrink);
        drinkVM.addProduct(cherryJuiceDrink);


        HotDrinksWendingMachine hotDrinksVM = new HotDrinksWendingMachine("горячие напитки");
        HotDrink capuchinoHotDrink = new HotDrink("капучино", 210);
        capuchinoHotDrink.setTemperature(70);
        capuchinoHotDrink.setVolume(150);
        HotDrink latteHotDrink = new HotDrink("latte", 190);
        latteHotDrink.setTemperature(70);
        latteHotDrink.setVolume(150);
        hotDrinksVM.addProduct(latteHotDrink);
        hotDrinksVM.addProduct(capuchinoHotDrink);


        wendMachine.addProduct(appleJuiceDrink);
        wendMachine.addProduct(cherryJuiceDrink);
        wendMachine.addProduct(latteHotDrink);
        wendMachine.addProduct(capuchinoHotDrink);


        wendMachine.printProducts();
        drinkVM.printProducts();
        hotDrinksVM.printProducts();

        for (int i = 0; i < wendMachine.getProductList().size(); i++) {
            wendMachine.getProductFromVM(i).consume();
        }

    }
}