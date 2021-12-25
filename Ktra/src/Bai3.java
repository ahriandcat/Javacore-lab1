public class Bai3 {
    public static void isPrimeNumber(int n) {
        if (n < 2) {
            System.out.println("Không phải số nguyên tố");
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                System.out.println("Không phải số nguyên tố");
            }
            else System.out.println("là số nguyên tố");
            break;
        }
        System.out.println();
    }
}
