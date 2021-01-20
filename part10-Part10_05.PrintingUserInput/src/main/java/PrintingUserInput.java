
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while(true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            list.add(line);
        }
        String newLine = list.stream().reduce("", (pString, word) -> pString + word +"\n");
        System.out.println(newLine);
    }
}
