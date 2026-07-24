public class Main {

    // Linear Search
    public static int linearSearch(Product[] products, String key) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(key)) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search (Array must be sorted)
    public static int binarySearch(Product[] products, String key) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int compare = products[mid].productName.compareToIgnoreCase(key);

            if (compare == 0)
                return mid;
            else if (compare < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Apple", "Fruits"),
                new Product(102, "Banana", "Fruits"),
                new Product(103, "Laptop", "Electronics"),
                new Product(104, "Mobile", "Electronics"),
                new Product(105, "Shoes", "Fashion")
        };

        String searchItem = "Laptop";

        int linearResult = linearSearch(products, searchItem);

        if (linearResult != -1)
            System.out.println("Linear Search: Product found at index " + linearResult);
        else
            System.out.println("Product not found.");

        int binaryResult = binarySearch(products, searchItem);

        if (binaryResult != -1)
            System.out.println("Binary Search: Product found at index " + binaryResult);
        else
            System.out.println("Product not found.");
    }
}