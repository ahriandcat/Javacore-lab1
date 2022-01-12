import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
   static Scanner sc = new Scanner(System.in);
   static Service service = new Service();
   static ArrayList<Movie> moviesList = service.getAllMovie();

   public static void menu(){
       System.out.println("------------------------------------------");
       System.out.println("1 - Show movie list");
       System.out.println("2 - Show movie list by year");
       System.out.println("3 - Show movie list by title");
       System.out.println("4 - Search by title");
       System.out.println("5 - Show 3 most watched movies");
       System.out.println("6 - Search by category");
       System.out.println("0 - Exit program");
       System.out.print("  Input your choose : ");
   }

   public static void mainMenu(){
       while (true){
           menu();
           int a = sc.nextInt();
           switch (a){
               case 1 -> service.show(moviesList);
               case 2 -> service.sortByYear(moviesList);
               case 3 -> service.sortByName(moviesList);
               case 4 -> service.searchByName(moviesList);
               case 5 -> service.showMovieByHighestView(moviesList);
               case 6 -> service.searchByCategory(moviesList);
               case 0 -> System.exit(0);
               default -> System.out.println("This option is not avalable");
           }
       }
   }



}

