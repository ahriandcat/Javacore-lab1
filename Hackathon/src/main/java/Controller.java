import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);

    public static void mainMenu() {
        ArrayList<Account> createAccount = new ArrayList<>();
        while (true) {
            AccountService.menu();
            int chooseMenu = Integer.parseInt(sc.nextLine());
            switch (chooseMenu) {
                case 1 -> {
                    System.out.print("Username : ");
                    String user = sc.nextLine();
                    System.out.print("Password : ");
                    String pass = sc.nextLine();
                    for (Account account : createAccount) {
                        if (account.getUserName().equals(user) && account.getPassWord().equals(pass)) {
                            System.out.println("Chào mừng " + user + " bạn có thể thực hiện các lựa chọn sau : ");
                            boolean signIn = true;
                            while (signIn) {
                                AccountService.subSignInMenu();
                                int choose = Integer.parseInt(sc.nextLine());
                                switch (choose) {
                                    case 1 -> {
                                        System.out.print("Nhập username bạn muốn đổi : ");
                                        AccountService.changeUser(account);
                                        signIn = false;
                                    }
                                    case 2 -> {
                                        System.out.print("Nhập password bạn muốn đổi : ");
                                        AccountService.changePassWord(account);
                                        signIn = false;
                                    }
                                    case 3 -> {
                                        System.out.println("Nhập email đang sử dụng : ");
                                        String presentEmail = sc.nextLine();
                                        while (!account.getEmail().equals(presentEmail)) {
                                            System.out.println("Nhập sai thông tin email, vui lòng thử lại : ");
                                            presentEmail = sc.nextLine();
                                        }
                                        System.out.println("Nhập email bạn muốn đổi : ");
                                        String newEmail = sc.nextLine();
                                        while (account.getEmail().equals(newEmail)) {
                                            System.out.println("Email này đang được sử dụng, vui lòng nhập email khác : ");
                                            newEmail = sc.nextLine();
                                        }
                                        AccountService.changeEmail(account, newEmail);
                                    }
                                    case 4 -> {
                                        signIn = false;
                                    }
                                    case 0 -> System.exit(0);
                                }
                            }
                        }
                        if (account.getUserName().equals(user) && !account.getPassWord().equals(pass)) {
                            System.out.println("Sai mật khẩu");
                            boolean signIn = true;
                            while (signIn) {
                                signIn = false;
                            }
                        }
                        if (!account.getUserName().equals(user)) {
                            System.out.println("Tài khoản không tồn tại");
                            boolean signIn = true;
                            while (signIn) {
                                signIn = false;
                            }
                        }
                    }
                    if (createAccount.isEmpty()) {
                        System.out.println("Tài khoản không tồn tại");
                    }
                }

                case 2 -> {
                    AccountService.createAccount(createAccount);
                }
                case 3 -> {
                    System.out.println("Nhập Username : ");
                    String oldUser = sc.nextLine();
                    System.out.println("Nhập Email đăng ký tài khoản : ");
                    String oldEmail = sc.nextLine();
                    for (Account account : createAccount) {
                        if (account.getUserName().equals(oldUser) && account.getEmail().equals(oldEmail)) {
                            System.out.println("Nhập mật khẩu mới : ");
                            String newPass = sc.nextLine();
                            account.setPassWord(newPass);
                            System.out.println("Đổi mật khẩu thành công");
                        } else if (!account.getUserName().equals(oldUser)) {
                            System.out.println("Username không tồn tại, vui lòng thử lại :");
                        } else if (!account.getEmail().equals(oldEmail)) {
                            System.out.println("Email không chính xác, vui lòng thử lại : ");
                        }
                    }
                    if (createAccount.isEmpty()) {
                        System.out.println("Tài khoản không tồn tại");
                    }
                }
            }
        }
    }
}
