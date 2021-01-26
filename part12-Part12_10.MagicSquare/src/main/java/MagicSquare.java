
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    // implement these three methods
    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> sumR = new ArrayList<>();
        int sum = 0;
        for (int row = 0; row < square.length; row++) {
            for (int column = 0; column < square[row].length;column++) {
                int value = square[row][column];
                sum+=value;
            }
            sumR.add(sum);
            sum = 0;
        }
        return sumR;
    }

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> sumC = new ArrayList<>();
        for(int col = 0; col < square.length; col++) {
            int sum = 0;
            for(int row = 0; row <square[col].length;row++) {
                int value = square[row][col];
                sum+=value;
            }
            sumC.add(sum);
        }
        return sumC;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> sumD = new ArrayList<>();
        int sum1 = 0;
        int sum2 = 0;
        int last = square.length-1;
        for (int i = 0; i < square.length; i++) {
            int value = square[i][i];
            sum1+=value;
        }
        sumD.add(sum1);
        for(int row = last; row >=0;row--) {
            int value = square[row][last-row];
            sum2+=value;
        }

        sumD.add(sum2);
        return sumD;
    }

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
