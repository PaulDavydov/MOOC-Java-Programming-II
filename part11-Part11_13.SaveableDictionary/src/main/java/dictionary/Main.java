package dictionary;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // You can test your dictionary here
        SaveableDictionary dictionary = new SaveableDictionary("words1.txt");
        dictionary.load();

// use the dictionary

        dictionary.save();
    }
}
