package FPT;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    static Scanner sc = new Scanner(System.in);

    public ArrayList<Product> getAllProduct() {
//        String [] type = {"Accessory", "Apple", "Laptop", "Phone"};
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Ipad pro 2021", "mới", 30000000, 100, 90, "Apple", "Apple"));
        products.add(new Product(2, "Iphone 13 promax", "mới", 28000000, 100, 80, "Apple", "Apple,Điện thoại"));
        products.add(new Product(3, "Macbook Pro 2021", "mới", 50000000, 800, 40, "Apple", "Apple,Laptop"));
        products.add(new Product(4, "Sạc Macbook Pro", "mới", 1600000, 150, 120, "Apple", "Apple,Phụ kiện"));
        products.add(new Product(5, "Fold 3 5G", "mới", 45000000, 100, 60, "Samsung", "Điện thoại"));
        products.add(new Product(6, "S21 Ultra", "cũ", 17000000, 20, 15, "Samsung", "Điện thoại"));
        products.add(new Product(7, "Mi 11 Ultra", "mới", 19000000, 90, 10, "Xiaomi", "Điện thoại"));
        products.add(new Product(8, "XB 950N1", "mới", 4000000, 200, 109, "Sony", "Phụ kiện"));
        products.add(new Product(9, "Robot hút bụi", "mới", 5000000, 50, 10, "Xiaomi", "Phụ kiện"));
        products.add(new Product(10, "Asus ProBook", "mới", 50000000, 50, 30, "Asus", "Laptop"));
        products.add(new Product(11, "Loa XB21", "cũ", 1000000, 300, 180, "Sony", "Phụ kiện"));
        products.add(new Product(12, "Rog phone 3", "cũ", 28000000, 100, 90, "Asus", "Điện thoại"));
        products.add(new Product(13, "Casio Gshock", "mới", 3000000, 100, 90, "Casio", "Phụ kiện"));
        products.add(new Product(14, "Oppo Reno", "cũ", 11000000, 100, 90, "OPPO", "Điện thoại"));

        return products;
    }

    public void typeMenu() {
        System.out.println("----------------------------------------------------------");
        System.out.println("Tất cả danh mục : ");
        System.out.println("   1 - Apple");
        System.out.println("   2 - Điện thoại");
        System.out.println("   3 - Laptop");
        System.out.println("   4 - Phụ kiện");
        System.out.println("   0 - Quay lại");
        System.out.print("Nhập lựa chọn : ");
    }
    public void priceMenu() {
        System.out.println("----------------------------------------------------------");
        System.out.println("Các mức giá : ");
        System.out.println("   1 - Dưới 2 triệu");
        System.out.println("   2 - Từ 2 - 4 triệu");
        System.out.println("   3 - Từ 4 - 7 triệu");
        System.out.println("   4 - Từ 7 - 13 triệu");
        System.out.println("   5 - Trên 13 triệu");
        System.out.println("   0 - Quay lại");
        System.out.print("Nhập mức giá cần tìm :");
    }
    public void showListByType(ArrayList<Product> products) {
        String type = null;
        int choose = 0;
        boolean a = true;
        while (a) {
            typeMenu();
            boolean isContinue = true;
            while (isContinue) {
                try {
                    choose = Integer.parseInt(sc.nextLine());
                    if (choose > 4 || choose < 0) {
                        throw new MyException("Không hợp lệ");
                    }
                    isContinue = false;
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                    System.out.print("Vui lòng nhập lại : ");
                } catch (NumberFormatException e) {
                    System.out.print("Vui lòng nhập lại : ");
                }
                if (choose == 1) {
                    type = "Apple";
                }
                if (choose == 2) {
                    type = "Điện thoại";
                }
                if (choose == 3) {
                    type = "Laptop";
                }
                if (choose == 4) {
                    type = "Phụ kiện";
                }
                if (choose == 0) {
                    a = false;
                    break;
                }
                for (Product p : products) {
                    if (p.getType().contains(type)) {
                        System.out.println(p);
                    }
                }
            }
        }
    }
    public void searchByManufacturer(ArrayList<Product> products){
        System.out.println("Nhập tên hãng cần tìm : ");
        String manufacturer = sc.nextLine();
        int count = 0;
        for (Product p:products){
            if (p.getManufacturer().toLowerCase().contains(manufacturer.toLowerCase())){
                System.out.println(p);
                count++;
            }
        }
        if (count == 0){
            System.out.println("Không tìm thấy hãng");
        }

    }
    public void searchByPrice(ArrayList<Product> products){
        boolean a = true;
        while (a){
            priceMenu();
            boolean isContinue =true;
            int choose = 0;
            while (isContinue) {
                try {
                    choose = Integer.parseInt(sc.nextLine());
                    if (choose >5 || choose <0){
                        throw new MyException("Không hợp lệ");
                    }
                    isContinue = false;
                }catch (MyException e){
                    System.out.println(e.getMessage());
                    System.out.print("Vui lòng nhập lại : ");
                }catch (NumberFormatException e){
                    System.out.print("Vui lòng nhập lại : ");
                }
            }
            if (choose==1){
                for (Product p: products){
                    if (p.getPrice()<2000000){
                        System.out.println(p);
                    }
                }
            }
            if (choose==2){
                for (Product p: products){
                    if (p.getPrice()>=2000000&&p.getPrice()<=4000000){
                        System.out.println(p);
                    }
                }
            }
            if (choose==3){
                for (Product p: products){
                    if (p.getPrice()>=4000000&&p.getPrice()<=7000000){
                        System.out.println(p);
                    }
                }
            }
            if (choose==4){
                for (Product p: products){
                    if (p.getPrice()>=7000000&&p.getPrice()<=13000000){
                        System.out.println(p);
                    }
                }
            }
            if (choose==5){
                for (Product p: products){
                    if (p.getPrice()>13000000){
                        System.out.println(p);
                    }
                }
            }
            if (choose == 0) {
                a=false;
            }
        }
    }
    public void searchByName(ArrayList<Product>products){
        String name = null;
        boolean isContinue = true;
        while (isContinue){
            System.out.println("Nhập tên cần tìm : ");
            try {
                name = sc.nextLine();
                int count = 0;
                for (Product p : products){
                    if (p.getName().toLowerCase().contains(name.toLowerCase())){
                        count++;
                        System.out.println(p);
                    }
                }
                if(count==0)  throw new MyException("Sản phẩm không tồn tại");
                if(count >0) isContinue = false;
            }catch (MyException e){
                System.out.println(e.getMessage());
                isContinue = false;
            }
        }
    }
    public void showNumberProductByType(ArrayList<Product> products){
        String type = null;
        int count = 0;
        int choose = 0;
        boolean a = true;
        while (a) {
            typeMenu();
            boolean isContinue = true;
            while (isContinue) {
                try {
                    choose = Integer.parseInt(sc.nextLine());
                    if (choose > 4 || choose < 0) {
                        throw new MyException("Không hợp lệ");
                    }
                    isContinue = false;
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                    System.out.print("Vui lòng nhập lại : ");
                } catch (NumberFormatException e) {
                    System.out.print("Vui lòng nhập lại : ");
                }
                if (choose == 1) {
                    type = "Apple";
                }
                if (choose == 2) {
                    type = "Điện thoại";
                }
                if (choose == 3) {
                    type = "Laptop";
                }
                if (choose == 4) {
                    type = "Phụ kiện";
                }
                if (choose == 0) {
                    a = false;
                    break;
                }
                for (Product p : products) {
                    if (p.getType().toLowerCase().contains(type.toLowerCase())) {
                        count++;
                    }
                }
                System.out.println("Số sản phẩm thuộc danh mục "+type.toUpperCase()+" là "+ count);
            }
        }
    }
}

