import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;
    public DictionaryOfManyTranslations() {
        dictionary = new HashMap<>();
    }
    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word,new ArrayList<>());
        ArrayList<String> words = this.dictionary.get(word);
        words.add(translation);
    }
    public ArrayList<String> translate(String word) {
        if(dictionary.containsKey(word)) {
            return dictionary.get(word);
        }

        return new ArrayList<String>();
    }
    public void remove(String word) {
        dictionary.remove(word);
    }
}
