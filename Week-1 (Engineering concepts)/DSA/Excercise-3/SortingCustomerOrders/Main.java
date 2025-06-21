public class Main {
    static void bubbleSortByPrice(Orders[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].getTotalPrice() > arr[j + 1].getTotalPrice()) {
                    Orders temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void quickSortByPrice(Orders[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSortByPrice(arr, low, pi - 1);
            quickSortByPrice(arr, pi + 1, high);
        }
    }

    static int partition(Orders[] arr, int low, int high) {
        double pivot = arr[high].getTotalPrice();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].getTotalPrice() < pivot) {
                i++;
                Orders temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Orders temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void printOrders(Orders[] arr) {
        for (Orders order : arr) {
            System.out.println(order);
        }
    }

    public static void main(String[] args) {
        Orders[] orders = new Orders[] {
            new Orders("Papun", 101, 3000),
            new Orders("Amit", 102, 2000),
            new Orders("Zara", 103, 4000),
            new Orders("Neha", 104, 1000)
        };

        System.out.println("Original Orders:");
        printOrders(orders);

     
        bubbleSortByPrice(orders);
        System.out.println("\nAfter Bubble Sort (by totalPrice):");
        printOrders(orders);

       
        orders = new Orders[] {
            new Orders("Papun", 101, 3000),
            new Orders("Amit", 102, 2000),
            new Orders("Zara", 103, 4000),
            new Orders("Neha", 104, 1000)
        };

        // Quick Sort
        quickSortByPrice(orders, 0, orders.length - 1);
        System.out.println("\nAfter Quick Sort (by totalPrice):");
        printOrders(orders);
    }
}
