package dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary{
    private Map<String,String> dictionary1;
    private Map<String,String> dictionary2;
    private String file;
    public SaveableDictionary() {
        dictionary1 = new HashMap<>();
        dictionary2 = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary1 = new HashMap<>();
        this.dictionary2 = new HashMap<>();
        this.file = file;
    }

    public void add(String words, String translation) {
        if(dictionary1.containsKey(words)) {
            return;
        }
        this.dictionary1.put(words,translation);
        this.dictionary2.put(translation,words);
    }

    public void delete(String word) {
        String t = translate(word);
        dictionary1.remove(word);
        dictionary1.remove(t);
        dictionary2.remove(t);
    }

    public String translate(String word) {
        if(dictionary1.containsKey(word)) {
            return dictionary1.get(word);
        }
        if(dictionary2.containsKey(word)) {
            return dictionary2.get(word);
        }
        return null;
    }

    public boolean load() {
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                this.dictionary1.put(parts[0],parts[1]);
                this.dictionary2.put(parts[1],parts[0]);
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public boolean save()  {
        try {
            PrintWriter writer = new PrintWriter(file);
            for(String i : dictionary1.keySet()) {
                writer.println(i + ":" + dictionary1.get(i));
            }
            writer.close();
            return true;
        } catch (IOException e) {
            return false;
        }

    }
}
