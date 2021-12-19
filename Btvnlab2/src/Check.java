import java.util.Scanner;

public class Check {
    public void checkPoint (double c) {
        if(c < 6) {
            System.out.println("Bạn đã trượt");
        }
        else {
            System.out.println("Bạn đã đạt");
        }
    }

    public void checkString(String chuoi_1, String chuoi_2){
        if (chuoi_1.equals(chuoi_2)) {
            System.out.println("hai chuỗi giống nhau");
        }
        else {
            System.out.println("hai chuỗi khác nhau");
        }
        if (chuoi_1.length() == chuoi_2.length()) {
            System.out.println("kích thước hai chuỗi bằng nhau");
        }
        else {
            System.out.println("Kích thước hai chuỗi khác nhau");
        }
    }
}
