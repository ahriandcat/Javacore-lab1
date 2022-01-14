import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
   static Scanner sc = new Scanner(System.in);
   static Team team = new Team();
   static ArrayList<Player> allPlayer = team.getAllTeam();
   public static void menu(){
       System.out.println("----------------------------------------------------");
       System.out.println("1 - Đội hình 1GK - 4DF - 4MF - 2FW");
       System.out.println("2 - Đội hình 1GK - 4DF - 3MF - 3FW");
       System.out.println("3 - Đội hình 1GK - 3DF - 5MF - 2FW");
       System.out.println("0 - Thoát chương trình");
       System.out.print("Lựa chọn : ");
   }
    public static void mainMenu(){
        while (true){
            menu();
            int choose = sc.nextInt();
            switch (choose) {
                case 1 -> {
                    int df = 4;
                    int fw = 4;
                    int mf = 2;
                    ArrayList<Player> choiceTeam = team.buildTeam(df, fw, mf, allPlayer);
                    team.show(choiceTeam);
                }
                case 2 -> {
                    int df2 = 4;
                    int fw2 = 3;
                    int mf2 = 3;
                    ArrayList<Player> choiceTeam2 = team.buildTeam(df2, fw2, mf2, allPlayer);
                    team.show(choiceTeam2);
                }
                case 3 -> {
                    int df3 = 3;
                    int fw3 = 5;
                    int mf3 = 2;
                    ArrayList<Player> choiceTeam3 = team.buildTeam(df3, fw3, mf3, allPlayer);
                    team.show(choiceTeam3);
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Không có đội hình này");
            }
        }
    }

}
