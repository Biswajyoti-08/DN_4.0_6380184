public class Product {
    private final int productId;
    private String productName;
    private String category;
    public static int size;
    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
       this.category=category;
       size++;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCategory(String category) {
        this.category=category;
    }

    public String getCategory(){
        return  this.category;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId + ", Name: " + productName + ", Category:"+category;
    }
}
