import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bài 2");
        //Bai2
        Check check = new Check();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm thực hành : ");
        double a = sc.nextDouble();
        while (a>10) {
            System.out.println("Nhập lại điểm thực hành");
             a = sc.nextDouble();
        }
        System.out.println("Điểm thực hành là : " + a);
        System.out.println("Nhập điểm lý thuyết : ");
        double b = sc.nextDouble();
        while (b>10) {
            System.out.println("Nhập lại điểm lý thuyết");
            b = sc.nextDouble();
        }
        System.out.println("Điểm lý thuyết là : " + b);
        double c = (a+b)/2;
        System.out.println("Điểm trung bình là: " + c);
        check.checkPoint(c);
        sc.nextLine();

        //Bai1
        System.out.println("Bài 1");
        System.out.println("Nhập vào chuỗi 1: ");
        String chuoi_1 = sc.nextLine();
        System.out.println("Chuỗi 1 là: " + chuoi_1);
        System.out.println("Nhập vào chuỗi 2: ");
        String chuoi_2 = sc.nextLine();
        System.out.println("Chuỗi 2 là: " + chuoi_2);
        check.checkString(chuoi_1,chuoi_2);
    }
}

