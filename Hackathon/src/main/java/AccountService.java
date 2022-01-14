import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AccountService {
    static Scanner sc = new Scanner(System.in);
    public static void createAccount(ArrayList<Account> accounts) {
        String EMAIL_PATTERN = "^[\\w]+@([a-z]+\\.[a-z]{3})$";
        String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[.,_;-])(?=\\S+$).{7,15}$";
        System.out.println("Nhập username mới : ");
        String user = sc.nextLine();
        System.out.println("Nhập password mới : ");
        String pass = sc.nextLine();
        while (!Pattern.matches(PASSWORD_PATTERN, pass)){
            System.out.println("Mật khẩu không đúng định dạng, mời nhập lại : ");
            pass = sc.nextLine();
        }
        System.out.println("Nhập email : ");
        String email = sc.nextLine();
        while (!Pattern.matches(EMAIL_PATTERN, email)){
            System.out.println("Email không đúng định dạng, mời nhập lại : ");
            email = sc.nextLine();
        }
        for (Account a : accounts){
            while (a.getEmail().equals(email)){
                System.out.println("Email đã tồn tại, mời nhập lại");
                email = sc.nextLine();
            }
        }
        Account newAccount = new Account(user, pass, email);
        accounts.add(newAccount);
    }

    public static void menu() {
        System.out.println("------------------------------------------------------");
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Tạo tài khoản");
        System.out.println("3 - Quên mật khẩu?");
    }

    public static void subSignInMenu() {
        System.out.println("1 - Đổi username");
        System.out.println("2 - Đổi password");
        System.out.println("3 - Đổi email");
        System.out.println("4 - Đăng Xuất");
        System.out.println("0 - Thoát chương trình");
    }

    public static void changeUser(Account account) {
        String newUserName = sc.nextLine();
        account.setUserName(newUserName);
        System.out.println("Thay đổi username thành công");
    }

    public static void changePassWord(Account account) {
        String newPassWord = sc.nextLine();
        account.setPassWord(newPassWord);
        System.out.println("Thay đổi password thành công");
    }
    public static void changeEmail(Account account, String email) {
        account.setEmail(email);
        System.out.println("Thay đổi email thành công");
    }
}


