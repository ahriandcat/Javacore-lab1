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
        boolean a = true;
        while (a) {
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    service.printProductArray(products);
                    break;
                case 2:
                    service.searchByName(products);
                    break;
                case 3:
                    service.searchByType(products);
                    break;
                case 4:
                    service.updateNameAndSellPrice(products);
                    break;
                case 5:
                    service.deleteProduct(products);
                    break;
                case 6:
                    service.addProducts(products);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("This option is not avalable");
            }
        }
    }
}