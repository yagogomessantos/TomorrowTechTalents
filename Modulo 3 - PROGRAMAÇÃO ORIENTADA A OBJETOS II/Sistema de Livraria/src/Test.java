import domain.model.*;
import domain.repository.ProductRepository;
import infrastructure.repository.BookRepositoryImpl;
import infrastructure.stock.StockManagerImpl;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {

        loadSomeProducts();

    }

    private static void loadSomeProducts() {
        Game game1 = new Game("Fifa22", 55d, "EAsports", "nao sei", "nao sei", 1);
        Game game2 = new Game("Fifa21", 55d, "EAsports", "nao sei", "nao sei", 1);
        Movie movie1 = new Movie("Avengers", 19.9, "Marvel", "nao lembro", "nao lembro", "nao lembro", 1);
        Movie movie2 = new Movie("Avengers 2", 19.9, "Marvel", "nao lembro", "nao lembro", "nao lembro", 1);
        Book book1 = new Book("Clean Code", 22D, "nao sei", "nao sei", "nao sei", 1);
        Book book2 = new Book("Java Efetivo", 22D, "nao sei", "nao sei", "nao sei", 1);
        MusicAlbum musicAlbum1 = new MusicAlbum("Better", 10.99, "Khalid", "pop", "nao sei", 1);
        MusicAlbum musicAlbum2 = new MusicAlbum("Saturday Night", 10.99, "Khalid", "pop", "nao sei", 1);
        Toy toy1 = new Toy("IronMan", 20.99, "nao sei", 1);
        Toy toy2 = new Toy("SuperMan", 20.99, "nao sei", 1);

        List<List<Product>> list = new ArrayList<>(List.of(
                new ArrayList<>(List.of(game1, game2)),
                new ArrayList<>(List.of(movie1, movie2)),
                new ArrayList<>(List.of(book1, book2)),
                new ArrayList<>(List.of(musicAlbum1, musicAlbum2)),
                new ArrayList<>(List.of(toy1, toy2))));
        Stock myStock = new StockManagerImpl("Stock Library", list);
        ProductRepository books = new BookRepositoryImpl(myStock);

        List<ProductRepository> listRepository = new ArrayList<ProductRepository>(List.<ProductRepository>of((ProductRepository) new ArrayList<ProductRepository>(List.of(books))));

//  listar
        books.list().forEach(System.out::println);
////  findById
        System.out.println("\n" + books.findById("Jo5"));
////  Salvar
        Book myNewBook = new Book("YAGO BOOK",0D,"JAVA","Yago","Yago",3);
        Book myNewBook2 = new Book("YAGO BOOK",0D,"JAVA","Yago","Yago",3);
        Book myNewBook3 = new Book("Java Efetivo",0D,"JAVA","nao sei","nao sei",3);
        books.save(myNewBook);
        books.save(myNewBook);
        books.save(myNewBook);
//        books.save(myNewBook2);
//        books.save(myNewBook3);
//        System.out.println();
        books.list().forEach(System.out::println);
//
////   Remove
        books.remove("YK10");
//        System.out.println();
//        System.out.println();
//        books.list().forEach(System.out::println);
//        System.out.println();
//        System.out.println();
//        Book myNewBookUpdated = new Book("Upadated BOOK",0D,"JAVA","Yago","Yago",3);
//        books.update("Jo5",myNewBookUpdated);
//        books.list().forEach(System.out::println);
        books.remove("Jo5");
        books.remove("Ce4");
//        System.out.println(myStock.getProductList().get(2).isEmpty());
//        System.out.println(myStock.getProductList().get(2) );
//        System.out.println(books.list());
        books.list().forEach(System.out::println);
        books.save(myNewBook);
        books.save(myNewBook);
        books.save(myNewBook);
        books.list().forEach(System.out::println);
        books.remove("YK10");
        books.list().forEach(System.out::println);


    }


}
