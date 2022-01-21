import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập x hoặc q để thoát chương trình");
        while (true) {
            System.out.print("Nhập số : ");
            String a = sc.nextLine();
            if (a.equals("x") || a.equals("q")){
                return;
            }
            int count = 0;
            int a2 = 0;
            boolean isContinue = true;
            while (isContinue){
                try {
                    a2 = Integer.parseInt(a);
                    isContinue = false;
                }catch (NumberFormatException e){
                    System.out.print("Nhập lại số : ");
                    a = sc.nextLine();
                }
            }
            if (a2<2){
                System.out.println(a2 + " không phải số nguyên tố");
            }
            for (int i = 1; i <= Math.sqrt(a2); i++) {
                if (a2 % i == 0) {
                    count++;
                }
            }
            if (count ==1 && a2!=1){
                System.out.println(a2 + " là số nguyên tố");
            }
            else if (count >1 && a2>=2){
                System.out.println(a2 + " không là số nguyên tố");
            }


        }
    }
}
