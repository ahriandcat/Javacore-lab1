public class Main {
    public static void main(String[] args) {
        InputProduct input = new InputProduct();
        Product[] products = input.addProduct(2);
        input.show(products);
    }
}
