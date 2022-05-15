import java.util.List;

public class SupermarketStock {

    public String name;
    private List<Product> productList;
    private String identifier;
    private static int identifierSeed;


    SupermarketStock(String name, List<Product> productList) {
        this.name = name;
        this.productList = productList;
        identifierGenerator();
    }

    private void identifierGenerator() {
        this.identifier = String.valueOf(identifierSeed++);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }





}
