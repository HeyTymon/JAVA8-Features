package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static Optional<String> getStudentsName() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        if (studentOptional.isPresent()) {
            return studentOptional.map(Student::getName);
        }

        return Optional.empty();
    }

    public static void main(String[] args) {

        Optional<String> stringOptional = getStudentsName();

        if(stringOptional.isPresent())
        {
            System.out.println(stringOptional.get().length());
        }

    }
}
