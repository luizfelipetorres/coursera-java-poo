package Lab9.ex2.store;

import java.util.Date;

public class CD extends Item {
    private Artist artist;
    private Date releaseDate;

    

    public CD(String title, double price, int quantity, Artist artist, Date releaseDate) {
        super(title, price, quantity);
        this.setArtist(artist);
        this.setReleaseDate(releaseDate);
    }

    public CD(Artist artist, Date releaseDate) {
        this.artist = artist;
        this.releaseDate = releaseDate;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

}
