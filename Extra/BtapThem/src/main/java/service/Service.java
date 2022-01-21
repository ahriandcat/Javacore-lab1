package service;

import exception.MyException;
import model.Gender;
import model.Person;
import validate.Validate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    static Scanner sc = new Scanner(System.in);

    public ArrayList<Person> getAllPerson() {
        ArrayList<Person> person = new ArrayList<>();
        person.add(new Person(1, "Nguyễn Văn A", LocalDate.of(1990, 4, 25), Gender.nam, "Hà Nội", "0123456789", "nva@gmail.com"));
        person.add(new Person(2, "Nguyễn Thị B", LocalDate.of(1991, 5, 24), Gender.nữ, "Hà Nội", "0123456254", "ntb@gmail.com"));
        person.add(new Person(3, "Nguyễn Văn C", LocalDate.of(1992, 6, 23), Gender.nam, "Hà Nội", "0123451289", "nvc@gmail.com"));
        person.add(new Person(4, "Nguyễn Thị D", LocalDate.of(1993, 7, 22), Gender.nữ, "Hà Nội", "01234520011", "ntd@gmail.com"));
        person.add(new Person(5, "Nguyễn Văn E", LocalDate.of(1994, 8, 21), Gender.nam, "Hà Nội", "0123459753", "nve@gmail.com"));
        person.add(new Person(6, "Nguyễn Thị F", LocalDate.of(1995, 9, 20), Gender.nữ, "Hà Nội", "0123453214", "ntf@gmail.com"));
        return person;
    }

    public void show(ArrayList<Person> person) {
        for (Person p : person) {
            System.out.println(p);
        }
    }

    public void showByGender(ArrayList<Person> person) {
        boolean show = true;
        while (show) {
            System.out.println("   1 - Nam");
            System.out.println("   2 - Nữ");
            System.out.println("   0 - Quay lại");
            System.out.println("Lựa chọn : ");
            int choose = 0;
            boolean isContinue = true;
            while (isContinue) {
                try {
                    choose = Integer.parseInt(sc.nextLine());
                    if (choose > 2 || choose < 0) {
                        throw new MyException("Không hợp lệ");
                    }
                    isContinue = false;
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                    System.out.print("Mời nhập lại : ");
                } catch (NumberFormatException e) {
                    System.out.print("Mời nhập lại : ");
                }
            }
            switch (choose) {
                case 1 -> {
                    for (Person p : person) {
                        if (p.getGender()==Gender.nam) {
                            System.out.println(p);
                        }
                    }
                }
                case 2 -> {
                    for (Person p : person) {
                        if (p.getGender()==Gender.nữ) {
                            System.out.println(p);
                        }
                    }
                }
                case 0 -> show = false;
            }
        }
    }

    public void addPerson(ArrayList<Person> person) {
        Validate validate = new Validate();
        int id = 0;
        System.out.println("Nhập ID : ");
        boolean isContinue = true;
        while (isContinue) {
            try {
                id = Integer.parseInt(sc.nextLine());
                isContinue = false;
            } catch (NumberFormatException e) {
                    System.out.print("Thử lại : ");
            }
        }
        for (Person p : person) {
            if (id == p.getId()) {
                System.out.println("ID đã bị trùng");
                return;
                }
            }
        System.out.print("Nhập Tên : ");
        String name = sc.nextLine();
        System.out.print("Nhập năm sinh : ");
        int year = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tháng sinh : ");
        int month = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập ngày sinh : ");
        int day = Integer.parseInt(sc.nextLine());
        LocalDate dob = LocalDate.of(year, month, day);
        Gender gender = getGender();

        System.out.print("Nhập quê quán : ");
        String home = sc.nextLine();
        System.out.print("Nhập số điện thoại : ");
        String phone = sc.nextLine();
        while (!validate.validatePhone(phone)){
            System.out.println("Số điện thoại phải có 10-11 số, vui lòng thử lại : ");
            phone = sc.nextLine();
        }
        System.out.print("Nhập email : ");
        String email = sc.nextLine();
        while (!validate.validateEmail(email)){
            System.out.println("Email không hợp lệ, vui lòng thử lại : ");
            email = sc.nextLine();
        }
        Person newPerson = new Person(id, name, dob, gender, home, phone, email);
        person.add(newPerson);
        System.out.println("Danh sách sau khi cập nhật : ");
        show(person);
    }
    public static Gender getGender(){
        int Choose = 1;
        System.out.println("Chọn giới tính : ");
        for (Gender g : Gender.values()){
            System.out.println(Choose + " - "+ g);
            Choose++;
        }
        Gender gender = null;
        int genderChoose = Integer.parseInt(sc.nextLine());
        while (genderChoose <1 || genderChoose>2){
            System.out.println("Không có lựa chọn này, nhập lại : ");
            genderChoose = Integer.parseInt(sc.nextLine());
        }
        if (genderChoose == 1){
            gender = Gender.nam;
        }
        if (genderChoose == 1){
            gender = Gender.nữ;
        }

        return gender;
    }
    public void searchByID(ArrayList<Person> person){
        System.out.print("Nhập ID cần tìm : ");
        int id = 0;
        boolean isContinue = true;
        while (isContinue) {
            try {
                id = Integer.parseInt(sc.nextLine());
                isContinue = false;
            } catch (NumberFormatException e) {
                System.out.print("Thử lại : ");
            }
        }
        int count=0;
        for (Person p :person){
            if (p.getId()==id){
                System.out.println(p);
                count++;
            }
        }
        if (count==0){
            System.out.println("Không tìm thấy ID này");
        }
    }
}


