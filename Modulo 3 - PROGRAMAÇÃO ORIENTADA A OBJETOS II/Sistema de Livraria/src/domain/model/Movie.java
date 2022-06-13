package domain.model;

public class Movie extends Product {

    private String studio;
    private String director;
    private String genre;
    private String producer;


    public Movie(String name, Double price, String studio, String director, String genre, String producer, int quantity) {
        super(name,price,quantity);
        this.studio = studio;
        this.director = director;
        this.genre = genre;
        this.producer = producer;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
