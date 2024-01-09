package Seminar1;

import java.util.ArrayList;

public class Drink extends Product {

    private Integer height;

    public Drink(String name, double price, Integer height) {
        super(name, price);
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }

    public void consume(){
        System.out.println("Напиток выпит");
    }
    public void setHeight(Integer height) {
        this.height = height;
    }


}
