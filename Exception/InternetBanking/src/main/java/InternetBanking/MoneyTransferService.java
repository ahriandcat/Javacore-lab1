package InternetBanking;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

public class MoneyTransferService {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Account> account = new ArrayList<>();
    static  ArrayList<MoneyTransfer> moneyTransferList = new ArrayList<>();
    static DecimalFormat formatter = new DecimalFormat("###.###");
    public ArrayList<MoneyTransfer> moneyTransfer(Account a){
        Bank bank = null;
        Login.transferMoneyMenu();
        System.out.println("Lựa chọn : ");
        int chooseBank = Integer.parseInt(sc.nextLine());
        if (chooseBank==1){
            bank=Bank.TPBank;
        }
        if (chooseBank==2){
            bank=Bank.VietcomBank;
        }
        if (chooseBank==3){
            bank=Bank.Techcombank;
        }
        if (chooseBank==4){
            bank=Bank.BIDV;
        }
        System.out.println("Nhập số tài khoản cần giao dịch : ");
        String accountNumberPattern = "^[0-9]+.{8,16}$";
        String accountNumber = sc.nextLine();
        while (!Pattern.matches(accountNumberPattern,accountNumber)){
            System.out.println("Số tài khoản phải có 8-16 ký tự, vui lòng thử lại : ");
            accountNumber = sc.nextLine();
        }
        System.out.println("Nhập số tiền cần chuyển : ");
        double money = 0;
        boolean isContinue = true;
        while (isContinue){
            try {
                money = Double.parseDouble(sc.nextLine());
                isContinue=false;
            }
            catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số");
            }
        }
        while (money<50000){
            System.out.println("Số tiền gửi phải lớn hơn 50,000 Vnđ, vui lòng thử lại : ");
            money = Double.parseDouble(sc.nextLine());
        }
        while(a.getMoney()-money < 50000){
            System.out.println("Số dư tài khoản không được nhỏ hơn 50,000 Vnđ");
            money = Double.parseDouble(sc.nextLine());
        }
        System.out.println("Nhập ghi chú : ");
        String note = sc.nextLine();


        MoneyTransfer transferHistory = new MoneyTransfer(bank,accountNumber,money,note);
        moneyTransferList.add(transferHistory);
        a.setMoney(a.getMoney()-money);

        return moneyTransferList;
    }

    public static void show(){
        int count=1;
        for (MoneyTransfer m : moneyTransferList){
            System.out.println("id : "+count+" Ngày giao dịch : "+ LocalDate.of(2022,02,14) +" - "+m);
            count++;
        }
    }
}
