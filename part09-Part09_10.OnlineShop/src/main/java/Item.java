public class Item {
    private String name;
    private int quantity;
    private int price;
    public Item(String product, int qty, int unitPrice) {
        this.name = product;
        this.quantity = qty;
        this.price = unitPrice;
    }
    public int price() {
        return this.price * this.quantity;
    }
    public void increaseQuantity() {
        this.quantity++;
    }
    public String toString() {
        return this.name + ": " + this.quantity;
    }
}
