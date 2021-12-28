import java.util.Scanner;

public class InputProduct {
    public Product createProduct () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID sản phẩm : ");
        String id = sc.nextLine();
        System.out.println("Nhập tên sản phẩm : ");
        String name = sc.nextLine();
        System.out.println("Nhập số lượng sản phẩm : ");
        int quantity = Integer.parseInt(sc.nextLine());
        System.out.println("Nhâp đơn vị sản phẩm (gói, chiếc, thùng) : ");
        String unit = sc.nextLine();
        while (!unit.equals("gói") && !unit.equals("thùng") && !unit.equals("chiếc")) {
            System.out.println("Đơn vị không hợp lệ");
            System.out.println("Nhập lại đơn vị : ");
            unit = sc.nextLine();
        }
        System.out.println("giá tiền nhập 01 "+unit+ " (vnđ) :");
        int importPrice = sc.nextInt();
        System.out.println("Giá bán 01 "+ unit+ " (vnđ) :");
        int sellPrice = sc.nextInt();
        System.out.println("Số "+unit+" đã bán : ");
        int soldNumber = sc.nextInt();


        Product product = new Product(id,name,quantity,unit,importPrice,sellPrice,soldNumber);
        return product;

    }

    public double profit(int importPrice, int sellPrice, int soldNumber){
        return (sellPrice-importPrice)*soldNumber;
    }

    public Product[] addProduct () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số loại sản phẩm : ");
        int size = sc.nextInt();
        Product[] products = new Product[size];
        for (int i=0;i<size;i++){
            products[i]= createProduct();
        }
        return products;
    }

    public void show(Product[] products) {
        for (Product p: products) {
            System.out.println(p + ", lợi nhuận : "+ profit(p.importPrice,p.sellPrice,p.soldNumber)+ " vnđ");
        }
    }
}
