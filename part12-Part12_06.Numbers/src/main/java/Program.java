
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random luck = new Random();
        int number = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            int ranNumber = luck.nextInt(11);
                System.out.println(ranNumber);

        }

    }

}
