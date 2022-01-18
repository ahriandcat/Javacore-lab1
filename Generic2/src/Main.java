import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PersonModel<Student> students = new PersonModel<>();
        students.add(new Student(1,"Vuong",23));
        students.add(new Student(2,"Giang",23));

        students.display();
        System.out.println();
        PersonModel<Employee> employees = new PersonModel<>();
        employees.add(new Employee(3,"ABC",7000000));
        employees.add(new Employee(4,"XYZ",8000000));

        employees.display();
    }
}
