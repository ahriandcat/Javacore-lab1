package InternetBanking;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import static java.util.regex.Pattern.matches;

public class Login {
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat formatter = new DecimalFormat("###,###");

    public ArrayList<Account> getAllAccount() {
        ArrayList<Account> account = new ArrayList<>();
        account.add(new Account("123456789", "123456", 5000000));
        return account;
    }
    public static void menu(){
        System.out.println("-------------------------------");
        System.out.println("1 - Kiểm tra số dư");
        System.out.println("2 - Chuyển tiền");
        System.out.println("3 - Xem lịch sử giao dịch");
        System.out.println("4 - Thoát chương trình");
    }
    public static void transferMoneyMenu(){
        System.out.println("Chuyển tiền tới ngân hàng : ");
        System.out.println("1 - TPBank");
        System.out.println("2 - Vietcombank");
        System.out.println("3 - Techcombank");
        System.out.println("4 - BIDV");
    }

    public void login(ArrayList<Account> account) {
        boolean log = true;
        while (log) {
            System.out.print("Nhập số điện thoại : ");
            String accountNumberPattern = "^[0-9]+.{8,16}$";
            String phoneNum = sc.nextLine();
            while (!matches(accountNumberPattern,phoneNum)){
                System.out.println("Số tài khoản phải có 8-16 ký tự, vui lòng thử lại : ");
                phoneNum = sc.nextLine();
            }
            System.out.print("Nhập mật khẩu : ");
            String pass = sc.nextLine();
            for (Account a : account) {
                if (a.getPhoneNumber().equals(phoneNum)&& a.getPassWord().equals(pass)){
                    System.out.println("Đăng nhập thành công");
                    boolean logSuccess =true;
                    while (logSuccess){
                        menu();
                        loginSuccess(a);
                    }
                    log = false;
                    break;
                }
                if (!a.getPhoneNumber().equals(phoneNum)){
                    System.out.println("Tài khoản không tồn tại, vui lòng thử lại");
                    break;
                }
                if  (a.getPhoneNumber().equals(phoneNum)&&!a.getPassWord().equals(pass)){
                    System.out.println("Sai mật khẩu, vui lòng thử lại");
                    break;
                }
            }
        }
    }
    public void loginSuccess(Account account){
        MoneyTransferService transfer = new MoneyTransferService();
        System.out.println("Lựa chọn : ");
        int a = 0;
        boolean isContinue = true;
        while (isContinue){
            try{
                a = Integer.parseInt(sc.nextLine());
                if (a<0||a>4){
                    throw new MyException("Lựa chọn không hợp lệ");
                }
                isContinue = false;
            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại : ");
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập lại : ");
            }
        }
        switch (a){
            case 1-> {
                System.out.println("Số dư tài khoản : "+formatter.format(account.getMoney())+" Vnd");
            }
            case 2-> {
                ArrayList<MoneyTransfer> transferList = transfer.moneyTransfer(account);
                System.out.println("Giao dịch thành công");
            }
            case 3-> {
                MoneyTransferService.show();
            }
            case 4-> System.exit(0);
        }
    }
}
