import java.util.ArrayList;

public class Box implements Packable {
    private ArrayList<Packable> box;
    private double boxWeight;
    public Box(double weight) {
        this.box = new ArrayList<>();
        this.boxWeight = weight;
    }
    public void size() {
        this.box.size();
    }
    public void add(Packable item) {
        if ((weight() + item.weight()) <= boxWeight) {
            this.box.add(item);
        }
    }

    public String toString() {
        return "Box: " + this.box.size() + " items, total weight " + weight() + " kg";
    }
    @Override
    public double weight() {
        double sum = 0;
        for (Packable i : box) {
            sum += i.weight();
        }
        return sum;
    }
}
