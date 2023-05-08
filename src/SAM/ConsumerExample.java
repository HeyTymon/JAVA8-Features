package SAM;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c1 = student -> System.out.println(student); // możliwe ze względu na metode toString.
    static Consumer<Student> c2 = student -> System.out.println(student.getName());
    static Consumer<Student> c3 = student -> System.out.println(student.getActivities());
    public static void printStudents()
    {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c1);
    }
    public static void printActivities()
    {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2.andThen(c3));
    }

    public static void filteredPrint()
    {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(student.getGradeLevel() >= 3)
            {
                c2.andThen(c3).accept(student);
            }
        });
    }

    public static void main(String[] args) {

        filteredPrint();
    }
}
