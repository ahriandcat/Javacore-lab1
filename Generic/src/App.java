import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"Vuong",10));
        students.add(new Student(2,"Hieu",10));
        students.add(new Student(3,"Bac",10));
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher(4,"ABC",9000000));
        teachers.add(new Teacher(5,"DEF",9000000));
        teachers.add(new Teacher(6,"QWER",9000000));
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Chó",4,"Vàng trắng"));
        animals.add(new Animal("Mèo",4,"Trắng"));

        System.out.println("In danh sách học sinh : ");
        show(students);
//        showStudent(students);
        System.out.println("In danh sách giáo viên : ");
//        showTeacher(teachers);
        show(teachers);
        System.out.println("Danh sách động vật : ");
        show(animals);
    }

//    public static void showStudent(ArrayList<Student>students){
//        for (Student s : students){
//            System.out.println(s);
//        }
//    }
//
//    public static void showTeacher(ArrayList<Teacher>teachers){
//        for (Teacher t : teachers){
//            System.out.println(t);
//        }
//    }

    //Cách mới
    // ? extends Person => ko chạy dc animal vì không kế thừa Person
    // ? super Teacher => ko chạy animal và student
    public static void show(ArrayList<?> list){
        for (Object o : list){
            System.out.println(o);
        }
    }
}
