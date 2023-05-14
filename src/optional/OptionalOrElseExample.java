package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    public static String optionalOrElse() {
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> emptyStudent = Optional.empty();

        String name = emptyStudent.map(Student::getName).orElse("OrElse");
        return name;
    }

    public static String optionalOrElseGet() {
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> emptyStudent = Optional.empty();

        String name = emptyStudent.map(Student::getName).orElseGet(() -> "OrElseGet");
        return name;
    }

    public static String optionalOrElseThrow() {
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> emptyStudent = Optional.empty();

        String name = emptyStudent.map(Student::getName).orElseThrow(() -> new RuntimeException("Error"));

        return name;
    }

    public static void main(String[] args) {
        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseThrow());
    }
}
