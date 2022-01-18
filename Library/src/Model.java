import java.util.ArrayList;

public class Model <T>{
    private ArrayList<T> all = new ArrayList<>();

    public void addObject(T obj){
        all.add(obj);
    }

    public void show(T obj){
        for (T t : all){
            System.out.println(t);
        }
    }
}
