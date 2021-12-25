import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bài 1");
        Bai1 bai1 = new Bai1();
        bai1.array();
        bai1.array2();


        Bai2 bai2 = new Bai2();
        bai2.bai_2();

        System.out.println("Bài 3");
        Random rd = new Random();
        Bai3 primeNumber = new Bai3();
        int n = rd.nextInt(100);
        System.out.println("Số bất kỳ là : "+n);
        primeNumber.isPrimeNumber(n);

        System.out.println("Bài 4");
        Bai4 bai4 = new Bai4();
        System.out.println("10 số nguyên tố đầu tiên là : ");
        int i=2;
        int dem=0;
        int a=10;
        while (dem < a) {
            if (Bai4.primeNumber(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
        System.out.println();
        System.out.println();


        System.out.println("Bài 5");
        Bai5 name = new Bai5();
        name.Bai_5();
        name.Palindrome();


        System.out.println("Bài 6");
        Bai6 bai6 = new Bai6();
        String array6 [][]= bai6.inputA();
        bai6.printArray6(array6);
        bai6.mainLine(array6);


    }
}
