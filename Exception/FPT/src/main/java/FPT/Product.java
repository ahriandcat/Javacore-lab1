package FPT;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.DecimalFormat;
import java.util.Arrays;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    static DecimalFormat format = new DecimalFormat("###,###");
    private int id;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private int soldNumber;
    private String manufacturer;
    private String type;


    @Override
    public String toString() {
        return
                "id : " + id +
                ", Tên : " + name +
                ", Mô tả : " + description +
                ", Giá : " + format.format(price) + " Vnd" +
                ", Số lượng : " + quantity +
                ", Số sản phẩm đã bán : " + soldNumber +
                ", Hãng sản xuất : '" + manufacturer + '\'' +
                ", Danh mục : " + type ;
    }
}
