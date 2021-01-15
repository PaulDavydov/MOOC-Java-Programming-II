public class ProductWarehouse extends Warehouse{
    private String name;
    public ProductWarehouse(String productName, double capactiy) {
        super(capactiy);
        this.name = productName;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public String toString() {
        return this.name + ": " + super.toString();
    }

}
