
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> list = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            list.add(line);
        }
        System.out.println("Print the average of the negative numbers or the positive number? (n/p)");
        String choice = scanner.nextLine();
        if (choice.equals("n")) {
            double averageN = list.stream().mapToInt(i -> Integer.valueOf(i))
                    .filter(n -> n < 0).average().getAsDouble();
            System.out.println("average of the numbers: " + averageN);
        } else {
            double averageP = list.stream().mapToInt(i -> Integer.valueOf(i))
                    .filter(n -> n > 0).average().getAsDouble();
            System.out.println("average of the numbers: " + averageP);
        }


    }
}
