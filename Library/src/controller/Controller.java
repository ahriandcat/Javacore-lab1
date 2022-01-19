package controller;

import exception.MyException;
import model.Ebook;
import model.Paper;
import model.SGK;
import service.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static Service service = new Service();
    static ArrayList<SGK> sgk = service.getAllSgkModel();
    static ArrayList<Paper> paper = service.getAllPaperModel();
    static ArrayList<Ebook> ebook = service.getAllEbookModel();
    static ArrayList<model.Library> Library = new ArrayList<>();


    public static void mainMenu(){
        Library.addAll(sgk);
        Library.addAll(paper);
        Library.addAll(ebook);
        while (true){
            service.menu();
            int choose = 0;
            boolean isContinue = true;
            while (isContinue){
                try {
                    choose = Integer.parseInt(sc.nextLine());
                    if (choose > 5 || choose < 0){
                        throw new MyException("Không hợp lệ");
                    }
                    isContinue = false;
                }catch (MyException e){
                    System.out.println(e.getMessage());
                    System.out.print("Vui lòng thử lại : ");
                }catch (NumberFormatException e){
                    System.out.print("Vui lòng thử lại : ");
                }

            }
            switch (choose){
                case 1->{
                    boolean case_1 = true;
                    while (case_1){
                        service.subMenu();
                        System.out.print("Nhập lựa chọn : ");
                        int chooseSubMenu = 0;
                        boolean subMenu = true;
                        while (subMenu){
                            try {
                                chooseSubMenu = Integer.parseInt(sc.nextLine());
                                if (chooseSubMenu > 3 || chooseSubMenu < 0){
                                    throw new MyException("Không hợp lệ");
                                }
                                subMenu = false;
                            }catch (MyException e){
                                System.out.println(e.getMessage());
                                System.out.print("Vui lòng thử lại : ");
                            }catch (NumberFormatException e){
                                System.out.print("Vui lòng thử lại : ");
                            }
                        }
                        switch (chooseSubMenu){
                            case 1 -> service.show(sgk);
                            case 2 -> service.show(paper);
                            case 3 -> service.show(ebook);
                            case 0 -> case_1 =false;
                        }
                    }
                }
                case 2 -> service.searchByName(Library);
                case 3 -> service.searchByCategory(Library);
                case 4 -> service.printHighestEbookDownload(ebook);
                case 5 -> service.showPaperByYear(paper);
                case 0 -> System.exit(0);
            }
        }
    }
}
