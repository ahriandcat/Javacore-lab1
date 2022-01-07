import java.text.DecimalFormat;

public class Product {
    private int id;
    private String name;
    private double sellPrice;
    private int quantity;
    private String type;
    private int soldNumber;

    public Product(int id, String name, double sellPrice, int quantity, String type, int soldNumber) {
        this.id = id;
        this.name = name;
        this.sellPrice = sellPrice;
        this.quantity = quantity;
        this.type = type;
        this.soldNumber = soldNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSoldNumber() {
        return soldNumber;
    }

    public void setSoldNumber(int soldNumber) {
        this.soldNumber = soldNumber;
    }

    @Override
    public String toString() {
        DecimalFormat formater = new DecimalFormat("###,###");
        return "Product id : " + id +
                ", name :" + name  +
                ", sellPrice : " + formater.format(sellPrice) +
                ", quantity : " + quantity +
                ", type : " + type +
                ", soldNumber : " + soldNumber;
    }
}