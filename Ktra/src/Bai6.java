import java.util.Scanner;

public class Bai6 {

    public static String[][] inputA() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng : ");
        int m = sc.nextInt();
        System.out.println("Nhập số cột");
        int n = sc.nextInt();
        String[][] a = new String[m][n];
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập phần tử");
                a[i][j] = sc.nextLine();
            }
        }
        return a;
    }

    public void printArray6(String[][] array6) {
        System.out.println("mảng vừa tạo là : ");
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                System.out.print(array6[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void mainLine(String [][] array6) {
        System.out.println("Đường chéo chính là : ");
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                if (i==j) {
                    System.out.print(array6[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
