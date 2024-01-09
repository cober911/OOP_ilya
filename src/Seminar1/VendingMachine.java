package Seminar1;

import java.util.ArrayList;

public class VendingMachine {
    private String name;
    protected ArrayList<Product> productList;

    public VendingMachine(String firstMachine) {
        this.name = firstMachine;
        this.productList = new ArrayList<Product>();
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public Product getProductByName(String name){
        for(Product el: productList){
            if (el.getName().equals(name)) return el;
        }
        return null;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "products=" + productList +
                '}';
    }
}
