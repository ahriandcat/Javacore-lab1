public class Main {
    public static void main(String[] args) {
        InputProduct input = new InputProduct();
        Product[] products = input.addProduct();
        input.show(products);
    }
}
