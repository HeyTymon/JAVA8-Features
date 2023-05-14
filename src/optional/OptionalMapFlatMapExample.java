package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    public static void optionalFilter()
    {
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> emptyStudent = Optional.ofNullable(null); // Optional.empty;

        optionalStudent.filter(s -> s.getGpa() >= 3.5).ifPresent(s -> System.out.println(s));
        optionalStudent.filter(s -> s.getGpa() >= 5).ifPresent(s -> System.out.println(s));
        emptyStudent.filter(s -> s.getGpa() >= 3.5).ifPresent(s -> System.out.println(s));
    }

    public static void main(String[] args) {
        optionalFilter();
    }
}
