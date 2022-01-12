import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Service {
    public ArrayList<Movie> getAllMovie(){
        ArrayList<Movie> movies = new ArrayList<>();
        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader("movie.json");
            Type type = new TypeToken<ArrayList<Movie>>(){}.getType();
            movies=gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return movies;
    }
    public void show(ArrayList<Movie> movies){
        for (Movie movie: movies){
            System.out.println(movie);
        }
    }
    public void sortByYear(ArrayList<Movie> movies){
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getYear()-o2.getYear();
            }
        });
        show(movies);
        }
    public void sortByName(ArrayList<Movie> movies){
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        show(movies);
    }
    public void searchByName(ArrayList<Movie> movies){
        System.out.println("Title search : ");
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        int count=0;
        for (Movie m : movies){
            if (m.getTitle().toLowerCase().contains(t)){
                System.out.println(m);
                count++;
            }
        }
        if (count == 0){
            System.out.println("There is no '"+ t.toUpperCase()+"' in this list ");
        }
    }
    public void showMovieByHighestView(ArrayList<Movie> movies){
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.getView()- o1.getView();
            }
        });
        for (int i=0;i<3;i++){
            System.out.println(movies.get(i));
        }
    }
    public void searchByCategory(ArrayList<Movie>movies){
        System.out.println("Category search : ");
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        int count=0;
        for (Movie m:movies) {
            for (String category : m.getCategory()) {
                if (category.toLowerCase().contains(c.toLowerCase())){
                    System.out.println(m);
                    count++;
                    break;
                }
            }
        }
        if (count==0){
            System.out.println("Cannot find '"+c.toUpperCase()+"' in this list");
        }
    }
}



