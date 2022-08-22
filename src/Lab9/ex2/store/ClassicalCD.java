package Lab9.ex2.store;

import java.util.Date;

public class ClassicalCD extends Item {
    private String composer;
    private String[] performers = new String[5];
    private int performersCount = 0;
    private String recordinLocation;
    private Date releaseDate;

    public ClassicalCD(String title, double price, int quantity, String composer, String[] performers,
            String recordinLocation, Date releaseDate) {
        super(title, price, quantity);
        this.setComposer(composer);
        for (String p : performers) {
            this.addPerformer(p);
        }
        this.setRecordinLocation(recordinLocation);
        this.setReleaseDate(releaseDate);
    }

    public void addPerformer(String name) {
        if (performersCount < performers.length) {
            performers[performersCount++] = name;
        } else {
            System.out.println("There's no space in the room!");
        }
    }

    public void showPerformers() {
        if (performersCount == 0) {
            System.out.println("No performers added yet!");
        }
        for (String performer : performers) {
            System.out.println("Performer: " + performer);
        }
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String[] getPerformers() {
        return performers;
    }

    public void setPerformers(String[] performers) {
        this.performers = performers;
    }

    public String getRecordinLocation() {
        return recordinLocation;
    }

    public void setRecordinLocation(String recordinLocation) {
        this.recordinLocation = recordinLocation;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

}
