public class CD implements Packable{
    private String artist;
    private String name;
    private int pubYear;
    public double weight;
    public CD(String artist, String name, int pubYear) {
        this.artist = artist;
        this.name = name;
        this.pubYear = pubYear;
        this.weight = 0.1;
    }
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.pubYear + ")";
    }
    @Override
    public double weight() {
        return weight;
    }
}
