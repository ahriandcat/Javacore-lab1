import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartItem {
    private int id;
    private User user;
    private Product productId;
    private String name;
    private long price;
    private int quantity;

    public CartItem(int id, User user, Product productId, String name, long price, int quantity) {
        this.id = id;
        this.user = user;
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                " name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
