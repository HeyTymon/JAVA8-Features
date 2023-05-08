package SAM;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Student> studentSupplier = () -> {
            return new Student("Tymon",3,3.9,"Male", Arrays.asList("Java"));
        };

        Supplier<List<Student>> studentListSupplier = () -> StudentDataBase.getAllStudents();

        System.out.println(studentSupplier.get());
        System.out.println(studentListSupplier.get());
    }
}
