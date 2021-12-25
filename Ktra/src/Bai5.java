import java.util.Scanner;

public class Bai5 {
    public static void Bai_5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi : ");
        String chuoi = sc.nextLine();
        String firstLetter = chuoi.substring(0, 1);
        String remainingLetters = chuoi.substring(1, chuoi.length());
        firstLetter = firstLetter.toUpperCase();
        chuoi = firstLetter + remainingLetters;
        System.out.println("Chuỗi sau khi chuẩn hóa : " + chuoi);
    }

    public static String Palindrome() {
        String chuoi;
        char kyTu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            kyTu = chuoi.charAt(chuoi.length() - i - 1);
            if (chuoi.charAt(i) == kyTu) {
                System.out.println("Chuỗi này là chuỗi Panlyndrome.");
                break;
            } else {
                System.out.println("Chuỗi này không là chuỗi Panlyndrome.");
                break;
            }
        }

        return chuoi;
    }
}
