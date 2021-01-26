
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        Random luck = new Random();
        while(numbers.size()<7) {
            int number = luck.nextInt(40) +1;
            if(numbers.contains(number)) {
                continue;
            }
            numbers.add(number);
        }
//        for (int i = 1; i <= 7;i++) {
//            int number = luck.nextInt(40) +1;
//            if(numbers.contains(number)) {
//                continue;
//            }
//            numbers.add(number);
//        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if(numbers.contains(number)) {
            return true;
        }
        return false;
    }
}

