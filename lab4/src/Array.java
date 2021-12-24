import java.util.Scanner;

public class Array {

    public String[] inputStringArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử chuỗi : ");
        int n = sc.nextInt();
        String [] stringArr = new String[n];
        sc.nextLine();
        for (int i=0;i<n;i++) {
            System.out.println("Nhập phần tử arr "+i);

            stringArr[i] = sc.nextLine();
        }
        return stringArr;

    }
    public void printArray (String[] arr) {
        System.out.println("Mảng vừa tạo là : ");

        for (String s : arr) {

            System.out.print(s + "\t");
        }
    }

    public int count(String[] arr) {
        int count =0;
        for (String s : arr) {
            if (s.equals("Java")) {
                count++;
            }
        }
        return count;
    }

    public void checkIndex (String[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kỳ : ");
        String a = sc.nextLine();
        System.out.print("Chuỗi "+a+" xuất hiện ở vị trí ");
        for (int i=0;i< arr.length;i++) {
            if (a.equals(arr[i])){
                System.out.print("arr"+i+" ");
            }
        }
        System.out.print("trong mảng");
    }

}
