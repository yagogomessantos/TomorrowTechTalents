import java.util.Scanner;

public class ProductDAOImplementation {

    private SupermarketStock stock;

    ProductDAOImplementation(SupermarketStock stock) {
        this.stock = stock;
    }

    public void addProduct() {
        Product product = createProduct();
        if (this.stock.getProductList().size() > 0) {
            boolean productWasNotAdded = true;
            for (int i = 0; i < this.stock.getProductList().size(); i++) {
                if (this.stock.getProductList().get(i).getName().equals(product.getName()) &&
                        this.stock.getProductList().get(i).getBrand().equals(product.getBrand())) {
                    int currentAmount = this.stock.getProductList().get(i).getStockAmount();
                    this.stock.getProductList().get(i).setStockAmount(currentAmount + product.getStockAmount());
                    System.out.println("This products is already in Stock. The quantity was incremented");
                    productWasNotAdded = false;
                    break;
                }
            }
            if (productWasNotAdded) {
                this.stock.getProductList().add(product);
                System.out.println("The product has been added to stock");
            }
        } else {
            this.stock.getProductList().add(product);
            System.out.println("The product has been added to stock");
        }

    }

    private Product createProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the name of the product: ");
        String name = scanner.nextLine();
        System.out.println("Type the section of the product: ");
        String section = scanner.nextLine();
        System.out.println("Type the type of the product: ");
        String type = scanner.nextLine();
        System.out.println("Type the brand of the product: ");
        String brand = scanner.nextLine();
        System.out.println("Type the quantity of the product: ");
        String stockAmount = scanner.nextLine();
        Product product = new Product(name, section, type, brand, Integer.valueOf(stockAmount));
        return product;
    }

    public void removeProduct(String id) {
        int index = findProduct(id);
        if (index != -1) {
            this.stock.getProductList().remove(this.stock.getProductList().get(index));
            System.out.println("Product has been removed from stock");
        } else {
            System.err.println("Could not find this product.");
        }

    }

    public void updateProduct(String id) {
        int index = findProduct(id);
        if (index != -1) {
            Product product = createProduct();
            this.stock.getProductList().get(index).setName(product.getName());
            this.stock.getProductList().get(index).setSection(product.getSection());
            this.stock.getProductList().get(index).setType(product.getType());
            this.stock.getProductList().get(index).setBrand(product.getBrand());
            this.stock.getProductList().get(index).setStockAmount(product.getStockAmount());
            System.out.println("Product has been updated ");
        } else {
            System.err.println("Could not find this product.");
        }

    }

    public void getAllProducts() {
        System.out.println("Stock list :");
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-25s %-25s %s\n", "Name", "Quantity", "ID");
        System.out.println("---------------------------------------------------------------------------");
        if (this.stock.getProductList().size() > 0) {
            for (int i = 0; i < this.stock.getProductList().size(); i++) {

                System.out.printf("%-25s %-24s  %s\n", this.stock.getProductList().get(i).getName(),
                        this.stock.getProductList().get(i).getBrand(),
                        this.stock.getProductList().get(i).getIdentifier());

            }
            System.out.println("---------------------------------------------------------------------------");
        } else {
            System.out.println("---------------------------------EMPTY--------------------------------------");
        }
    }

    private int findProduct(String id) {
        if (this.stock.getProductList().size() > 0) {
            for (int i = 0; i < this.stock.getProductList().size(); i++) {
                if (this.stock.getProductList().get(i).getIdentifier().equals(id)) {
                    return i;
                }
            }
        } else {
            System.out.println("There are no products in Stock");
        }
        return -1;
    }

    public void getProduct(String id) {
        int index = findProduct(id);
        if (index != -1) {
            System.out.println("Product Details :");
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.printf("%-18s %-18s %-18s %-18s %-18s %s\n", "Name", "Section", "Type", "Brand", "Quantity", "ID");
            System.out.println("---------------------------------------------------------------------------------------------------");
            if (this.stock.getProductList().size() > 0) {
                System.out.printf("%-18s %-18s %-18s %-20s %-15s %s\n", this.stock.getProductList().get(index).getName(),
                        this.stock.getProductList().get(index).getSection(),
                        this.stock.getProductList().get(index).getType(),
                        this.stock.getProductList().get(index).getBrand(),
                        this.stock.getProductList().get(index).getStockAmount(),
                        this.stock.getProductList().get(index).getIdentifier());
            } else
                System.err.println("Could not find this product.");
            }
        }
    }

