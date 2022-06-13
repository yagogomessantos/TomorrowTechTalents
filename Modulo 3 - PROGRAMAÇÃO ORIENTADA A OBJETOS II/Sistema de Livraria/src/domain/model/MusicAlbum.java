package domain.model;

public class MusicAlbum extends Product {

    private String musicians;
    private String genre;
    private String label;

    public MusicAlbum(String name, Double price, String musicians, String genre, String label,int quantity) {
        super(name,price,quantity);
        this.musicians = musicians;
        this.genre = genre;
        this.label = label;
    }

    public String getMusicians() {
        return musicians;
    }

    public void setMusicians(String musicians) {
        this.musicians = musicians;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
