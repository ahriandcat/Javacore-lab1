import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Service <T> {
    static Scanner sc = new Scanner(System.in);
    static int userID = 1;
    public ArrayList<Product> getAllProducts(){
        ArrayList<Product> allProducts = new ArrayList<>();
        allProducts.add(new Product(1,"Xeon E5-2696",Type.CPU,"Intel",3,50499000,20,"corespeed : 3.6 Mhz, 18 cores, 36 threads"));
        allProducts.add(new Product(2,"I9 12900K",Type.CPU,"Intel",3,17599000,100,"corespeed : 5.2 Mhz, 16 cores, 24 threads"));
        allProducts.add(new Product(3,"Ryzen Threadripper pro 3395WX",Type.CPU,"AMD",5,142409000,15,"corespeed : 4.2 Mhz, 64 cores, 128 threads"));
        allProducts.add(new Product(4,"Ryzen 9 5950X",Type.CPU,"AMD",3,19999000,50,"corespeed : 4.9 Mhz, 16 cores, 32 threads"));
        allProducts.add(new Product(5,"Ryzen 7 5800X",Type.CPU,"AMD",3,10999000,100,"corespeed : 4.7 Mhz, 8 cores, 16 threads"));
        allProducts.add(new Product(6,"RTX 3090 Gaming X Trio",Type.GPU,"MSI",5,68999000,100,"GPU clock : 1785 MHz, 24Gb vram"));
        allProducts.add(new Product(7,"RTX 3090 Aorus master",Type.GPU,"Gigabyte",5,68999000,100,"GPU clock : 1785 MHz, 24Gb vram"));
        allProducts.add(new Product(8,"RTX 3090 GaimgPro",Type.GPU,"Palit",5,60599000,100,"GPU clock : 1695 MHz, 24Gb vram"));
        allProducts.add(new Product(9,"RTX 3080Ti Ventus OC",Type.GPU,"MSI",5,48999000,100,"GPU clock : 1785 MHz, 12Gb vram"));
        allProducts.add(new Product(10,"ROG Strix RX 6900XT",Type.GPU,"Asus",5,59999000,100,"GPU clock : 2365 MHz, 16Gb vram"));
        allProducts.add(new Product(11,"Z690 Extreme Glacial",Type.Mainboard,"Asus",5,54999000,200,"m2Sata : 12 slots, m2Pcie : 5 slots, USB : 7 slots"));
        allProducts.add(new Product(12,"Z690 Extreme Maximus",Type.Mainboard,"Asus",5,25699000,200,"m2Sata : 10 slots, m2Pcie : 4 slots, USB : 5 slots"));
        allProducts.add(new Product(13,"MEG X570 Godlike",Type.Mainboard,"MSI",5,19999000,300,"m2Sata : 9 slots, m2Pcie : 3 slots, USB : 8 slots"));
        allProducts.add(new Product(14,"X299X Designare",Type.Mainboard,"Gigabyte",5,16259000,250,"m2Sata : 20 slots, m2Pcie : 5 slots, USB : 12 slots"));
        allProducts.add(new Product(15,"Z690 Taichi",Type.Mainboard,"Asrock",5,15399000,400,"m2Sata : 12 slots, m2Pcie : 4 slots, USB : 7 slots"));
        allProducts.add(new Product(16,"AX1600i",Type.PSU,"Corsair",5,12729000,500,"wattage : 1600W"));
        allProducts.add(new Product(17,"ROG Thor",Type.PSU,"Asus",5,10509000,500,"wattage : 1200W"));
        allProducts.add(new Product(18,"ROG Strix 850G",Type.PSU,"Asus",5,6229000,1000,"wattage : 850W"));
        allProducts.add(new Product(19,"MWE GOLD 1050 V2",Type.PSU,"Cooler Master",5,4729000,800,"wattage : 1050W"));
        allProducts.add(new Product(20,"GP P1000GM",Type.PSU,"Gigabyte",5,4039000,1200,"wattage : 1000W"));
        allProducts.add(new Product(21,"Fury Renegade",Type.SSD,"Kingston",5,31999000,200,"Capacity : 4TB"));
        allProducts.add(new Product(22,"MP600",Type.SSD,"Corsair",5,11899000,600,"Capacity : 2TB"));
        allProducts.add(new Product(23,"WD Black Game Dock",Type.SSD,"Western Digital",5,10999000,800,"Capacity : 1TB"));
        allProducts.add(new Product(24,"970 Pro",Type.SSD,"Samsung",5,10699000,400,"Capacity : 1TB"));
        allProducts.add(new Product(25,"Aorus",Type.SSD,"Gigabyte",5,6999000,500,"Capacity : 1TB"));
        allProducts.add(new Product(26,"Trident Z5",Type.Ram,"Gskill",5,13499000,450,"Capacity : 32GB"));
        allProducts.add(new Product(27,"Fury Beast",Type.Ram,"Kingston",5,9299000,250,"Capacity : 32GB"));
        allProducts.add(new Product(28,"Dominator Platinum",Type.Ram,"Corsair",5,9299000,850,"Capacity : 32GB"));
        allProducts.add(new Product(29,"Spectrix D80",Type.Ram,"Adata",5,6990000,1000,"Capacity : 32GB"));
        allProducts.add(new Product(30,"Trident Z Royal",Type.Ram,"Gskill",5,4599000,450,"Capacity : 16GB"));

        return allProducts;
    }
//Tạo tài khoản
    public User createUser(){
        Validate validate = new Validate();
        System.out.print("Nhập số điện thoại : ");
        String phoneNum = sc.nextLine();
//        while (!validate.validatePhone(phoneNum)){
//            System.out.println("Số điện thoại phải có 10-11 chữ số, vui lòng thử lại : ");
//            phoneNum = sc.nextLine();
//        }
        System.out.print("Nhập mật khẩu : ");
        String passWord = sc.nextLine();
//        while (!validate.validatePassWord(passWord)){
//            System.out.println("Mật khẩu phải có 7 đến 15 ký tự, trong đó có ít nhất 01 ký tự đặc biệt và 01 chữ in hoa");
//            System.out.println("Nhập mật khẩu : ");
//            passWord = sc.nextLine();
//        }
        System.out.print("Nhập email : ");
        String email = sc.nextLine();
//        while (!validate.validateEmail(email)){
//            System.out.println("Email không đúng định dạng, mời nhập lại : ");
//            email = sc.nextLine();
//        }
        System.out.print("Nhập địa chỉ : ");
        String address = sc.nextLine();
        System.out.print("Nhập họ tên : ");
        String name = sc.nextLine();
        User newUser = new User(userID,phoneNum,email,address,name,passWord);
        userID++;
        return newUser;
    }


    public void showListByType(ArrayList<Product> products, Type type){
        for (Product p : products){
            if (p.getType()==type){
                System.out.println(p);
            }
        }
    }
    public void showListByPrice(ArrayList<Product> products, long minPrice,long maxPrice){
        for (Product p : products){
            if (p.getPrice()>=minPrice && p.getPrice()<maxPrice){
                System.out.println(p);
            }
        }
    }
    public ArrayList<CartItem> userCartlist(ArrayList<CartItem> list, User user){
        ArrayList<CartItem> listByCart = new ArrayList<>();
        for (CartItem c : list){
            if(c.getUser().getUserID() == user.getUserID()) {
                listByCart.add(c);
            }
        }
        return listByCart;
    }
    public ArrayList<Order> userOrderList(ArrayList<Order> list, User user){
        ArrayList<Order> listByUser = new ArrayList<>();
        for (Order o : list){
            if(o.getUserID() == user.getUserID()) {
                listByUser.add(o);
            }
        }
        return listByUser;
    }
}
