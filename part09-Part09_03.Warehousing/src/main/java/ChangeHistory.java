import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;
    public ChangeHistory() {
        history = new ArrayList<>();
    }
    public void add(double status) {
        this.history.add(status);
    }
    public void clear() {
        this.history.clear();
    }
    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        }
        double maxValue = history.get(0);
        for(Double i : history) {
            if (maxValue < i) {
                maxValue = i;
            }
        }
        return maxValue;
    }
    public double minValue() {
        if(history.isEmpty()) {
            return 0;
        }
        double minValue = history.get(0);
        for(Double i : history) {
            if(minValue > i) {
                minValue = i;
            }
        }
        return minValue;
    }
    public double average() {
        if(history.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Double i : history) {
            sum += i;
        }
        double average = 1.0* sum / history.size();
        return average;
    }
    public String toString() {
        return this.history.toString();
    }
}
