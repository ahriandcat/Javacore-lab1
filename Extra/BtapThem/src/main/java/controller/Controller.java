package controller;

import exception.MyException;
import model.Person;
import service.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static Service service = new Service();
    static ArrayList<Person> people = service.getAllPerson();

    public static void menu(){
        System.out.println("--------------------------------------------------");
        System.out.println("   1 - Xem thông tin khách hàng");
        System.out.println("   2 - Xem thông tin khách hàng theo giới tính");
        System.out.println("   3 - Thêm thông tin khách hàng");
        System.out.println("   4 - Tìm thông tin khách hàng theo ID");
        System.out.println("   0 - Thoát ");
        System.out.print("Lựa chọn : ");
    }

    public static void mainMenu(){
        while (true){
            menu();
            int choose = 0;
            boolean isContinue = true;
            while (isContinue){
                try{
                    choose = Integer.parseInt(sc.nextLine());
                    if (choose < 0 || choose > 4){
                        throw new MyException("Không hợp lệ");
                    }
                    isContinue = false;
                }catch (MyException e){
                    System.out.println(e.getMessage());
                    System.out.print("Thử lại : ");
                }catch (NumberFormatException e){
                    System.out.print("Thử lại : ");
                }
            }
            switch (choose){
                case 1 -> service.show(people);
                case 2 -> service.showByGender(people);
                case 3 -> service.addPerson(people);
                case 4 -> service.searchByID(people);
                case 0 -> System.exit(0);
            }
        }
    }
}
