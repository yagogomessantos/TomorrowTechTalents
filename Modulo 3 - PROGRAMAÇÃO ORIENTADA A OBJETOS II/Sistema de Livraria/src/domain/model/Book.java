package domain.model;

public class Book extends Product {

    private String genre;
    private String writer;
    private String editor;

    public Book(String name, Double price, String genre, String writer, String editor, int quantity) {
        super(name, price, quantity);
        this.genre = genre;
        this.writer = writer;
        this.editor = editor;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + getName() + '\'' + ", id='" + getId() + '\'' + ", price=" + getPrice()
                + ", genre='" + genre + '\'' + ", writer='" + writer + '\'' + ", editor='" + editor + '\'' + ", quantity='" + getQuantity() + '\'' + '}';
    }
}
