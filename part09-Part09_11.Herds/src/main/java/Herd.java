
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private List<Movable> herds;
    public Herd() {
        this.herds = new ArrayList<>();
    }

    public String toString() {
        String line = "";
        for (Movable i : herds){
            line += i.toString().trim() + "\n";
        }
        return line;
    }

    public void addToHerd(Movable movable) {
        herds.add(movable);
    }
    @Override
    public void move(int dx, int dy) {
        for (Movable i : herds) {
            i.move(dx, dy);
        }
    }
}
