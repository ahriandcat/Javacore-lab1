import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    static Scanner sc = new Scanner(System.in);
    public static ArrayList<Product> getAllProduct(){
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1,"Knife",35000,40,Type.Houseware,30));
        products.add(new Product(2,"Noodles Package",10000,200,Type.Food,93));
        products.add(new Product(3,"T-shirt",120000,50,Type.Fashion,19));
        return products;

    }
    public static void printProductArray(ArrayList<Product> products){
        System.out.println("Product list : ");
        for (Product p : products){
            System.out.println(p);
        }
    }
    public static void searchByName(ArrayList<Product> products){
        System.out.println("Input name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int count = 0;
        for (Product p : products){
            if (p.getName().toLowerCase().contains(name.toLowerCase())){
                count++;
                System.out.println(p);
            }
        }
        if(count==0){
            System.out.println("There is no name "+"'"+name.toUpperCase()+"'"+ " in product list");
        }
    }

    public static void searchByType(ArrayList<Product> products){
        System.out.println("Input type : ");
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        int count = 0;
        for (Product p : products){
            if (p.getType().toString().contains(type.toLowerCase())){
                count++;
                System.out.println(p);
            }
        }
        if(count==0){
            System.out.println("There is no type "+"'"+type.toUpperCase()+"'"+ " in product list");
        }

    }
    public static void updateNameAndSellPrice(ArrayList<Product> products){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input product's ID : ");
        int id =sc.nextInt();
        for (Product p:products){
            if (p.getId()==id){
                System.out.println(p);
                System.out.println("Input new product's name : ");
                sc.nextLine();
                String name = sc.nextLine();
                p.setName(name);
                System.out.println("Input new sell price : ");
                double sellPrice = sc.nextDouble();
                p.setSellPrice(sellPrice);
                System.out.println("Product's info after changed : "+ p);
            }
        }
    }
    public static void deleteProduct(ArrayList<Product> products){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input product's ID : ");
        int id =sc.nextInt();
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            if(p.getId()==id){
                products.remove(p);
                System.out.println("Product's list after changed : ");
                printProductArray(products);
            }
        }
    }
    public static void addProducts(ArrayList<Product> products){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input ID : ");
        int id = Integer.parseInt(sc.nextLine());
        for (Product p : products){
            while (id == p.getId()){
                System.out.println("ID already exists, input another ID : ");
                id = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Input name");
        String name= sc.nextLine();
        for (Product p : products){
            while (name.equals(p.getName())){
                System.out.println("Name already exists, input another name : ");
                name= sc.nextLine();
            }
        }
        System.out.println("Input sell price");
        double price = sc.nextDouble();
        System.out.println("Input quantity");
        int quantity = sc.nextInt();
        Type type = getType();

        System.out.println("Input sold number");
        int sold = sc.nextInt();
        while (sold > quantity){
            System.out.println("Sold number cannot be bigger than quantity ");
            System.out.println("Input another sold number : ");
            sold = sc.nextInt();
        }

        Product newProduct = new Product(id,name,price,quantity,type,sold);
        products.add(newProduct);
        printProductArray(products);

    }
    public static Type getType(){
        int c = 1;
        System.out.println("Input type : ");
        for (Type t : Type.values()){
            System.out.println(c + "-" + t);
            c++;
        }
        Type type = null;
        int typeNumber = sc.nextInt();
        while (typeNumber <1 || typeNumber>3){
            System.out.println("Invalid type, please re-enter : ");
            typeNumber = sc.nextInt();
        }
        if(typeNumber == 1){
            type = Type.Houseware;
        }
        if(typeNumber == 2){
            type = Type.Food;
        }
        if(typeNumber == 3){
            type = Type.Fashion;
        }
        return type;
    }
}