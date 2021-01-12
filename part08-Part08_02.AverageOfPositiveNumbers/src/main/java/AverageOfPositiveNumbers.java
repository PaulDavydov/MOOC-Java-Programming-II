
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            int i = Integer.valueOf(scanner.nextLine());
            if (i == 0) {
                break;
            }
            if ( i < 0) {
                continue;
            }
            sum += i;
            count++;
        }
        double average = 1.0*sum/count;
        if(sum == 0) {
            System.out.println("Cannot calculate the average");
        }else {
            System.out.println(average);
        }
    }
}
