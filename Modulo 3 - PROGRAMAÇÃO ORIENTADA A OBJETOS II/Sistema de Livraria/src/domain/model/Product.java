package domain.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Product {

    private String name;
    private String id;
    private Double price;
    private int quantity;
    private static int identifierCounter;


    public Product(String name, Double price, int quantity) {
        this.name = name;
        this.id = identifierGenerator();
        this.price = price;
        this.quantity = quantity;
    }


    private String identifierGenerator() {
        return String.valueOf(this.name.charAt(0)) + String.valueOf(this.name.charAt(this.name.length() - 1)) + identifierCounter++;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }


}
