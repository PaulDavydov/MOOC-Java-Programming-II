
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<String> list = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            list.add(line);
        }
        double average = list.stream().mapToInt(i -> Integer.valueOf(i))
                .average().getAsDouble();
        System.out.println("average of the number: " + average);
    }

}
