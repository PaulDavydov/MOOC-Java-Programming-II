
import java.io.IOException;
import java.net.CookieHandler;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LiteracyComparison {
    
    public static void main(String[] args) {

        List<Person> lists = new ArrayList<>();
        String file = "literacy.csv";
        try (Scanner scan = new Scanner(Paths.get(file))){
            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                String[] splits = row.split(",");
                splits[2] = splits[2].trim();
                String gender = splits[2];
                String country = splits[3];
                int year = Integer.valueOf(splits[4]);
                //splits[5] = splits[5].trim();
                double percent = Double.valueOf(splits[5]);
                lists.add(new Person(gender,country,year,percent));
            }
            lists.sort((p1,p2) -> Double.compare(p1.getLiteracyPercent(),p2.getLiteracyPercent()));
            lists.stream().forEach(i -> System.out.println(i));

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}
