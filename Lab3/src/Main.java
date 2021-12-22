import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bài 1");
        String chuoi = "You only live once, but if you do it right, once is enough.";
        char character = 'o';
        int count = 0;
        for (int i=0;i<chuoi.length();i++) {
            if (chuoi.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện ký tự " + character + " là : " + count+" lần ");

        System.out.println("Bài 2");
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        System.out.println("Nhập số a : ");
        a= sc.nextDouble();
        System.out.println("Nhập số b : ");
        b= sc.nextDouble();
        System.out.println("Phương trình vừa nhập là " + a+"x "+"+ "+b+"=0");
        if (a==0) {
            if (b==0) {
                System.out.println("Phương trình có vô số nghiệm");
            }
            else System.out.println("Phương trình vô nghiệm");
        }
        else {
            System.out.println("Phương trình có nghiệm là : x = " + b*(-1)/a);
        }



    }
}
