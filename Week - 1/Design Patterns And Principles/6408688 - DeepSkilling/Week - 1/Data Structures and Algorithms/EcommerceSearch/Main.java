import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shirt", "Clothing"),
            new Product(103, "Book", "Stationery"),
            new Product(104, "Mobile", "Electronics"),
            new Product(105, "Pen", "Stationery")
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String searchName = sc.nextLine();

        
        int result = SearchFunctions.linearSearch(products, searchName);
        if (result != -1)
            System.out.println("Linear Search: Found - " + products[result]);
        else
            System.out.println("Linear Search: Product not found.");

      
        SearchFunctions.sortProducts(products); 
        int result2 = SearchFunctions.binarySearch(products, searchName);
        if (result2 != -1)
            System.out.println("Binary Search: Found - " + products[result2]);
        else
            System.out.println("Binary Search: Product not found.");
    }
}
