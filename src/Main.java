import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList();
        list.add(new Student("Ivanovich", 2));
        list.add(new Student("Petrov", 3));
        list.add(new Student("Kot", 4));
        list.add(new Student("Ivanov", 1));
        list.add(new Student("Ford", 5));
        list.add(new Student("Beer", 1));
        list.add(new Student("Slon", 2));

         Student.printStudents(list, 1);
        
    }
}