import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static SupermarketStock myStock;

    public static void main(String[] args) {

        loadSomeProducts();
        ProductDAOImplementation productDAOImplementation = new ProductDAOImplementation(myStock);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n\n\n\n-----------------------------Inventory Control-----------------------------\n");
            System.out.println("(1) All products");
            System.out.println("(2) Product Details");
            System.out.println("(3) Add a product");
            System.out.println("(4) Update a product");
            System.out.println("(5) Remove a product");
            System.out.println("(6) EXIT");
            String choice = scanner.nextLine();
            switch (choice) {

                case "1":
                    productDAOImplementation.getAllProducts();
                    break;
                case "2":
                    System.out.println("Type the product ID");
                    productDAOImplementation.getProduct(scanner.nextLine());
                    break;
                case "3":
                    productDAOImplementation.addProduct();
                    break;
                case "4":
                    System.out.println("Type the product ID to edit:");
                    productDAOImplementation.updateProduct(scanner.nextLine());
                    break;
                case "5":
                    System.out.println("Type the product ID to remove:");
                    productDAOImplementation.removeProduct(scanner.nextLine());
                    break;
                case "6":
                    System.out.println("Thanks for using the application");
                    break;
                default:
                    System.out.println("Please, choose between 1 to 5.");
                    break;

            }
            if (choice.equals("6")) {
                break;
            }
        }
        scanner.close();
    }

    public static void loadSomeProducts() {
        Product soap = new Product("Soap", "pharmacy", "Liquid soap", "Dove", 5);
        Product meat = new Product("chicken", "Meat & Seafood", "Chicken meat", "Pif Paf", 4);
        Product bread = new Product("Bread", "Bakery", "fresh breads", "no-brand", 6);
        Product spaghetti = new Product("Spaghetti", "Pasta & Rice", "Spaghetti", "Barilla Spaghetti", 3);
        Product ketchup = new Product("Ketchup", "Condiments", "Tomato Ketchup", "Heinz", 2);
        Product garbageBags = new Product("garbage Bags", "Household Items", "regular", "Solimo Tall", 4);
        Product pop = new Product("pop", "beverages", "Diet", "Coca-cola", 2);
        Product deodorant = new Product("deodorant", "household items", "Roll-On Deodorant", "Nivea", 3);
        List<Product> productList = new ArrayList<>();
        productList.add(soap);
        productList.add(meat);
        productList.add(bread);
        productList.add(spaghetti);
        productList.add(ketchup);
        productList.add(garbageBags);
        productList.add(pop);
        productList.add(deodorant);
        myStock = new SupermarketStock("MyStock", productList);
    }
}
