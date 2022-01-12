import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Product> products = ProductService.getAllProduct();

    public static void menu(){
        System.out.println("-------------------------------------------");
        System.out.println("1 - Watch full product list");
        System.out.println("2 - Search by name");
        System.out.println("3 - List products by type");
        System.out.println("4 - Update Product's name & sell price");
        System.out.println("5 - Delete a product");
        System.out.println("6 - Add product to list");
        System.out.println("0 - Exit program");
        System.out.print("\n Input your choose : ");
    }

    public static void mainMenu() {
        while (true) {
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> ProductService.printProductArray(products);
                case 2 -> ProductService.searchByName(products);
                case 3 -> ProductService.searchByType(products);
                case 4 -> ProductService.updateNameAndSellPrice(products);
                case 5 -> ProductService.deleteProduct(products);
                case 6 -> ProductService.addProducts(products);
                case 0 -> System.exit(0);
                default -> System.out.println("This option is not avalable");
            }
        }
    }
}
