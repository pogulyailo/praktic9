import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class Student {

    String name = "name";
    int course = 1;

    public Student (String name, int course) {

        this.course = course;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getCourse() {
        return this.course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
    public static void printStudents (List<Student>students, int course){


        Iterator <Student> iterator = students.iterator();

        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.course == course){
                System.out.println(student.name);
            }

        }
    }
}
