package Seminar1.Alex.Product;

public class Product {
    private String name;
    private int price;
    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void consume(){
        System.out.println("Продукт потреблен");
    }
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(Integer price){
        this.price = price;
    }
    @Override
    public String toString(){
        return name + ": " + price;
    }

}
