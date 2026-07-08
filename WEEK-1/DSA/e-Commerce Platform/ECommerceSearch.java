import java.util.Arrays;
import java.util.Comparator;


public class ECommerceSearch {

   
    public static Product linearSearch(Product[] products, String targetName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equalsIgnoreCase(targetName)) {
                return products[i];
            }
        }
        return null; // Product not found
    }

   
    public static Product binarySearch(Product[] products, String targetName) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = products[mid].getProductName().compareToIgnoreCase(targetName);

            if (comparison == 0) {
                return products[mid]; // Product found
            } else if (comparison < 0) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }
        return null; // Product not found
    }

      public static void main(String[] args) {

        // Create an array of products
        Product[] products = {
            new Product(101, "Laptop",      "Electronics"),
            new Product(102, "Smartphone",  "Electronics"),
            new Product(103, "Headphones",  "Accessories"),
            new Product(104, "Tablet",      "Electronics"),
            new Product(105, "Keyboard",    "Accessories"),
            new Product(106, "Mouse",       "Accessories"),
            new Product(107, "Monitor",     "Electronics"),
            new Product(108, "Charger",     "Accessories"),
            new Product(109, "Camera",      "Electronics"),
            new Product(110, "Printer",     "Electronics")
        };

        String searchTarget = "Tablet";

        // ---- LINEAR SEARCH ----
        System.out.println("========================================");
        System.out.println("       LINEAR SEARCH");
        System.out.println("========================================");

        long startTime = System.nanoTime();
        Product result1 = linearSearch(products, searchTarget);
        long endTime = System.nanoTime();

        if (result1 != null) {
            System.out.println("Found: " + result1);
        } else {
            System.out.println("Product '" + searchTarget + "' not found.");
        }
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");

        // ---- BINARY SEARCH ----
        System.out.println("\n========================================");
        System.out.println("       BINARY SEARCH");
        System.out.println("========================================");

        // Sort the array by productName for binary search
        Product[] sortedProducts = Arrays.copyOf(products, products.length);
        Arrays.sort(sortedProducts, Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));

        System.out.println("Sorted Products:");
        for (Product p : sortedProducts) {
            System.out.println("  " + p);
        }
        System.out.println();

        startTime = System.nanoTime();
        Product result2 = binarySearch(sortedProducts, searchTarget);
        endTime = System.nanoTime();

        if (result2 != null) {
            System.out.println("Found: " + result2);
        } else {
            System.out.println("Product '" + searchTarget + "' not found.");
        }
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");

        // ---- ANALYSIS ----
        System.out.println("\n========================================");
        System.out.println("       ANALYSIS & COMPARISON");
        System.out.println("========================================");
        System.out.println("| Algorithm     | Time Complexity |");
        System.out.println("|---------------|-----------------|");
        System.out.println("| Linear Search | O(n)            |");
        System.out.println("| Binary Search | O(log n)        |");
        System.out.println();
        System.out.println("Conclusion:");
        System.out.println("- For a small dataset, Linear Search is simple and effective.");
        System.out.println("- For a large e-commerce platform with thousands of products,");
        System.out.println("  Binary Search is far more suitable because of O(log n) complexity.");
        System.out.println("- Binary Search requires the data to be sorted, which adds a");
        System.out.println("  one-time cost of O(n log n), but subsequent searches are much faster.");
        System.out.println("- Recommendation: Use Binary Search for the e-commerce platform.");
    }
}

class Product {
    private int productId;
    private String productName;
    private String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "[" + productId + "] " + productName + " (" + category + ")";
    }
}