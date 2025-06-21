 public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Laptop", 5, 80000);
        Product p2 = new Product(102, "Mouse", 15, 500);
        Product p3 = new Product(103, "Keyboard", 10, 1500);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        inventory.displayProducts();

        inventory.updateProduct(102, "Wireless Mouse", 20, 750);
        inventory.deleteProduct(103);

        inventory.displayProducts();
    }
}
 