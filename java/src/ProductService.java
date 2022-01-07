import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ProductService {
    public ArrayList<Product> getAllProduct(){
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1,"Knife",35000,40,"Houseware",30));
        products.add(new Product(2,"Noodles Package",10000,200,"Food",93));
        products.add(new Product(3,"T-shirt",120000,50,"Fashion",19));
        return products;

    }
    public void printProductArray(ArrayList<Product> products){
        System.out.println("Product list : ");
        for (Product p : products){
            System.out.println(p);
        }
    }
    public void searchByName(ArrayList<Product> products){
        System.out.println("Input name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (Product p : products){
            if (p.getName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(p);
            }
        }
    }

    public void searchByType(ArrayList<Product> products){
        System.out.println("Input type : ");
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        for (Product p : products){
            if (p.getType().toLowerCase().contains(type.toLowerCase())){
                System.out.println(p);
            }
        }

    }
}
