import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static Product linearSearch(Product[] p1, int productId) {
        for (int i = 0; i < p1.length; i++) {
            if (p1[i].getProductId() == productId) {
                return p1[i];
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] arr, int productId) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid].getProductId() == productId) {
                return arr[mid];
            } else if (arr[mid].getProductId() < productId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Product product1 = new Product(101, "Laptop", "Electronics");
        Product product2 = new Product(102, "Saree", "Wardrobe");
        Product product3 = new Product(103, "Comb", "Accessories");

        Product[] arr = { product1, product2, product3 };

      
        Arrays.sort(arr, Comparator.comparingInt(Product::getProductId));

        int productId = 102;

     
        Product binaryResult = binarySearch(arr, productId);
        if (binaryResult != null) {
            System.out.println("Binary Search -> Product found: " + binaryResult.getProductName());
        } else {
            System.out.println("Binary Search -> Product not found.");
        }

        // Linear Search
        Product linearResult = linearSearch(arr, productId);
        if (linearResult != null) {
            System.out.println("Linear Search -> Product found: " + linearResult.getProductName());
        } else {
            System.out.println("Linear Search -> Product not found.");
        }
    }
}
