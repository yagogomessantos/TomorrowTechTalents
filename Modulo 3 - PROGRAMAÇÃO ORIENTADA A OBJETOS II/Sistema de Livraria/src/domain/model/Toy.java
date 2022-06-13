package domain.model;

import domain.model.Product;

public class Toy extends Product {

    private String type;

    public Toy(String name, Double price, String type, int quantity) {
        super(name,price,quantity);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
