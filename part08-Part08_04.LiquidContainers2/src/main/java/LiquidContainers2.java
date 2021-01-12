
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] splits = input.split(" ");
            int amount = Integer.valueOf(splits[1]);

            if(input.equals("add " + amount)) {
                first.add(amount);
            }
            if(input.equals("remove " + amount)) {
                second.remove(amount);
            }
            if(input.equals("move " + amount)) {
                if((first.contains() - amount) < 0) {
                    amount = first.contains();
                }
                first.remove(amount);
                second.add(amount);
            }
        }
    }

}
