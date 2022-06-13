package infrastructure.stock;

import domain.model.Product;
import domain.model.Stock;
import domain.repository.ProductRepository;

import java.util.List;

public class StockManagerImpl implements Stock {

    private String name;
    private String identifier;
    private List<List<Product>> productList;
    private List<ProductRepository> ProductRespositoriesList;
    private static int identifierSeed;

    public StockManagerImpl(String name, List<List<Product>> productList) {
        this.name = name;
        this.productList = productList;
//        this.ProductRespositoriesList = ProductRespositoriesList;
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

    @Override
    public List<List<Product>> getProductList() {
        return productList;
    }

    @Override
    public List<ProductRepository> getProductRepositoriesList() {
        return  this.ProductRespositoriesList;
    }
}
