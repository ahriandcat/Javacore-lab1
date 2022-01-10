import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static ProductService service = new ProductService();
    static ArrayList<Product> products = service.getAllProduct();

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
                case 1 -> service.printProductArray(products);
                case 2 -> service.searchByName(products);
                case 3 -> service.searchByType(products);
                case 4 -> service.updateNameAndSellPrice(products);
                case 5 -> service.deleteProduct(products);
                case 6 -> service.addProducts(products);
                case 0 -> System.exit(0);
                default -> System.out.println("This option is not avalable");
            }
        }
    }
}
