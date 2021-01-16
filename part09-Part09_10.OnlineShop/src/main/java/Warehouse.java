import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> products;
    private Map<String,Integer> stocks;

    public Warehouse() {
        products = new HashMap<>();
        stocks = new HashMap<>();

    }

    public void addProduct(String product, int price, int stock) {
        products.put(product, price);
        stocks.put(product,stock);
    }
    public int price(String product) {
        if (!products.containsKey(product)) {
            return -99;
        }
        return products.get(product);
    }

    public int stock(String product) {
        if (!stocks.containsKey(product)) {
            return 0;
        }
        return stocks.get(product);
    }

    public boolean take(String product) {
//        if(stocks.get(product) == 0) {
//            return false;
//        }
        if(!stocks.containsKey(product)) {
            return false;
        }
        stocks.put(product, stocks.get(product) - 1);
        if(stocks.get(product) < 0) {
            stocks.put(product, 0);
            return false;
        }
        return true;
    }

    public Set<String> products() {
        Set<String> names = new HashSet<>();
        for (String i : products.keySet()) {
            names.add(i);
        }
        return names;
    }
}
