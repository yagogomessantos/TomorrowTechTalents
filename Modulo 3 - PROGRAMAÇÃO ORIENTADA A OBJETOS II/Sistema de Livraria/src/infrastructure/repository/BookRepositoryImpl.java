package infrastructure.repository;

import domain.model.Book;
import domain.model.Product;
import domain.model.Stock;
import domain.repository.ProductRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookRepositoryImpl implements ProductRepository<Book> {

    private Stock stockManager;

    public BookRepositoryImpl(Stock stockManager) {
        this.stockManager = stockManager;
    }

    @Override
    public List<Book> list() {
        List<Product> bookList = null;
            for (List<Product> list : stockManager.getProductList()) {
                if(list.isEmpty()){
                    continue;
                }
                else if(list.get(0) instanceof Book) {
                    bookList = list;
                    return stockManager.filter(bookList, Book.class);
                }
            }

        return Collections.<Book>emptyList();
    }

    @Override
    public Book findById(String id) {
        Book myBook = null;
        for (Product book : list()) {
            if (book.getId().equals(id)) {
                myBook = (Book) book;
                break;
            }
        }
        return myBook;
    }

    @Override
    public void save(Book product) {
        List<Book> bookList = list();
        if (list().isEmpty()) {
            stockManager.getProductList().add(new ArrayList<>(List.of(product)));
            System.out.println("The product has been added to stock");
        } else {
            boolean productWasNotAdded = true;
            for (Book productInStock : bookList) {
                if (productInStock.getName().equals(product.getName()) &&
                        productInStock.getWriter().equals(product.getWriter())) {
                    int currentAmount = productInStock.getQuantity();
                    productInStock.setQuantity(currentAmount + product.getQuantity());
                    System.out.println("This product is already in Stock. The quantity was incremented");
                    productWasNotAdded = false;
                    break;
                }
            }
            if (productWasNotAdded) {
                bookList.add(product);
                System.out.println("The product has been added to stock ");
            }
        }
    }

    @Override
    public void remove(String id) {
        Book book = findById(id);
        if (book != null) {
            list().remove(book);
            System.out.println("Product has been removed from stock");
        } else {
            System.err.println("Could not find this product.");
        }
    }

    @Override
    public void update(String id, Book book) {
        Book bookInStock = findById(id);
        if (bookInStock != null) {
            bookInStock.setName(book.getName());
            bookInStock.setPrice(book.getPrice());
            bookInStock.setGenre(book.getGenre());
            bookInStock.setEditor(book.getEditor());
            bookInStock.setWriter(book.getWriter());
            bookInStock.setQuantity(book.getQuantity());
            System.out.println("Product has been updated");
        } else {
            System.err.println("Could not find this product.");
        }

    }


}
