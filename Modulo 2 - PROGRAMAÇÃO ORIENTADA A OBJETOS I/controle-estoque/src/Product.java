import java.util.Objects;

public class Product {


    private String name;
    private String section;
    private String type;
    private int stockAmount;
    private String brand;
    private String identifier;
    private static int identifierCounter;


    Product(String name, String section, String type, String brand, int stockAmount) {
        this.name = name;
        this.section = section;
        this.brand = brand;
        this.type=type;
        this.stockAmount = stockAmount;
        this.identifier = identifierGenerator();

    }

    private String identifierGenerator() {
       return String.valueOf(this.name.charAt(0)) +
               String.valueOf(this.name.charAt(this.name.length() - 1)) +
               identifierCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name) && brand.equals(product.brand);
    }

}
