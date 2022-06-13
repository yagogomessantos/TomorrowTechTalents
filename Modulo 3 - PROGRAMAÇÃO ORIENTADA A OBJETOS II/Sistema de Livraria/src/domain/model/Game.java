package domain.model;

public class Game extends Product {

    private String distributor;
    private String genre;
    private String studio;

    public Game(String name, Double price, String distributor, String genre, String studio, int quantity) {
        super(name,price,quantity);
        this.distributor = distributor;
        this.genre = genre;
        this.studio = studio;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
}
