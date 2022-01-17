package FPT;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static ProductService service = new ProductService();
    static ArrayList<Product> products = service.getAllProduct();
    public static void menu(){
        System.out.println("Chào mừng đến với FPT Shop, bạn có thể thực hiện các chức năng sau : ");
        System.out.println("----------------------------------------------------------");
        System.out.println("   1 - Tìm sản phẩm theo danh mục");
        System.out.println("   2 - Tìm sản phẩm theo hãng");
        System.out.println("   3 - Tìm sản phẩm theo mức giá");
        System.out.println("   4 - Tìm sản phấm theo tên");
        System.out.println("   5 - Liệt kê mỗi danh mục có bao nhiêu sản phẩm");
        System.out.println("   0 - Thoát chương trình");
        System.out.print("Nhập lựa chọn : ");
    }
    public static void mainMenu(){
        while(true){
            menu();
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                   service.showListByType(products);
                   break;
                case 2:
                    service.searchByManufacturer(products);
                    break;
                case 3:
                    service.searchByPrice(products);
                    break;
                case 4:
                    service.searchByName(products);
                    break;
                case 5:
                    service.showNumberProductByType(products);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}
