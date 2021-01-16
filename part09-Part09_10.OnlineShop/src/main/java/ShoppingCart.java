import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    private Map<String,Item> cart;
    public ShoppingCart() {
        cart = new HashMap<>();
    }
    public void add(String product, int price) {
        if(cart.containsKey(product))  {
            cart.get(product).increaseQuantity();
        } else {
            cart.put(product, new Item(product,1,price));
        }

    }
    public int price() {
        int sum = 0;
        for (Item i : cart.values()) {
            sum += i.price();
        }
        return sum;
    }

    public void print() {
        for (Item i : cart.values()) {
            System.out.println(i.toString());
        }
    }

}
