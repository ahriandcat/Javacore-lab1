public class Product {
    public String id;
    public String name;
    public int quantity;
    public String unit;
    public int importPrice;
    public int sellPrice;
    public int soldNumber;

    public Product(String id, String name, int quantity, String unit, int importPrice, int sellPrice,int soldNumber) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.importPrice = importPrice;
        this.sellPrice = sellPrice;
        this.soldNumber = soldNumber;
    }

    @Override
    public String toString() {
        return
                "id= " + id  +
                ", tên sản phẩm : " + name +
                ", số lượng : " + quantity +
                " " + unit +
                ", giá nhập 01 "+ unit + " :" + importPrice + " vnđ" +
                ", giá bán 01 "+ unit + " :" + sellPrice +" vnđ" + ", Số lượng đã bán là : " + soldNumber + " "+ unit;
    }
}
