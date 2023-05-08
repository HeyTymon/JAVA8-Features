package methodReference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> c1 = System.out::println; // possible because of toString method
    static Consumer<Student> c2 = Student::printActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c2);
    }
}
