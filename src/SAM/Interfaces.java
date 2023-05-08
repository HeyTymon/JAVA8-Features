package SAM;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Interfaces {

    static Consumer<Student> consumer1 = student -> System.out.println(student.getName());

    static Predicate<Student> predicate1 = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> predicate2 = student -> student.getGpa() >= 3.9;

    static Supplier<List<Student>> supplier1 = StudentDataBase::getAllStudents;

    public static void filteredStudents() {
        List<Student> studentList = supplier1.get();


    }

    public static void main(String[] args) {

    }
}
