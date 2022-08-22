package Lab9.ex2.store;

public class Artist {
    private String name;
    private String membersName[];
    private String memberInstruments[];

    

    public Artist(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
