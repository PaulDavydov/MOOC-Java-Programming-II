
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(true) {
            int i = Integer.valueOf(scanner.nextLine());
            if (i < 0) {
                break;
            }
            list.add(i);
        }

        list.stream().filter(i -> i >= 1 && i <=5).forEach(i -> System.out.println(i));

    }
}
