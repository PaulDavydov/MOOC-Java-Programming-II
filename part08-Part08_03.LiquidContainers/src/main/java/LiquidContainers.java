
import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] splits = input.split(" ");
            String command = splits[0];
            int amount = Integer.valueOf(splits[1]);
            if(input.equals("add " + amount)) {
                if (amount < 0) {
                    amount = 0;
                }
                first += amount;
                if(first>100) {
                    first = 100;
                }
                continue;
            }
            if(input.equals("move " + amount)) {
                if (amount < 0) {
                    amount = 0;
                }
                if((first - amount) < 0) {
                    amount = first;
                }
                second += amount;
                first-=amount;
                if(first < 0) {
                    first= 0;
                }
                if (second > 100) {
                    second = 100;
                }
            }
            if(input.equals("remove " + amount)) {
                if(amount < 0) {
                    amount = 0;
                }
                second -= amount;
                if(second < 0) {
                    second = 0;
                }
            }
        }
    }

}
