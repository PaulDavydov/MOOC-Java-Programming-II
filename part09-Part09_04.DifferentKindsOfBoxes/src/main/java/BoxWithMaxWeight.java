import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private ArrayList<Item> items;
    private int capacity;
    public BoxWithMaxWeight(int capacity) {
        items = new ArrayList<>();
        this.capacity = capacity;

    }

    @Override
    public void add(Item item) {
        int sum = 0;
        for (Item i : items) {
            sum += i.getWeight();
        }
        if((item.getWeight() + sum) <= capacity) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if(items.contains(item)) {
            return true;
        }
        return false;
    }
}
