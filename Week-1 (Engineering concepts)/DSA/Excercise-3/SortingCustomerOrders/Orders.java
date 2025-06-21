public class Orders{
    // o	Create a class Order with attributes like orderId, customerName, and totalPrice.
    private int orderId;
    private String customername;
    double totalPrice;

    public Orders(String customername, int orderId, double totalPrice) {
        this.customername = customername;
        this.orderId = orderId;
        this.totalPrice = totalPrice;
    }
    
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public String getCustomername() {
        return customername;
    }
    public void setCustomername(String customername) {
        this.customername = customername;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
     public String toString() {
        return "Orders{" + "customerName='" + customername + '\'' +
               ", orderId=" + orderId + ", price=" + totalPrice + '}';
    }
}