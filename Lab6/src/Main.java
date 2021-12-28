import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputProduct input = new InputProduct();
        Scanner sc = new Scanner(System.in);
        Product[] products = input.addProduct();
        input.show(products);
    }
}
