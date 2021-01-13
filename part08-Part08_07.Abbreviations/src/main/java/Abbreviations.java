import java.util.HashMap;
import java.util.Locale;

public class Abbreviations {
    private HashMap<String , String> word = new HashMap<>();
    public Abbreviations() {
        this.word = new HashMap<>();
    }
    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviation = sanitizedString(abbreviation);
        if(this.word.containsKey(abbreviation)) {
            System.out.println("Book is already added");
        } else {
            word.put(abbreviation,explanation);
        }
    }
    public static String sanitizedString(String string) {
        if(string == null) {
            return "";
        }
        string = string.toLowerCase();
        return string.trim();
    }
    public boolean hasAbbreviation(String abbreviation){
        if (word.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }
    public String findExplanationFor(String abbreviation) {
        if(word.containsKey(abbreviation)) {
            return word.get(abbreviation);
        }
        return null;
    }
}
