package constructorreference;

import data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    static Supplier<Student> studentSupplier1 = Student::new;

    static Function<String,Student> studentFunction1 = Student::new;

    public static void main(String[] args) {
        System.out.println(studentSupplier1.get());
        System.out.println(studentFunction1.apply("Tymon"));
    }
}
