package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findStudentGradeLevel() {
        return StudentDataBase.getAllStudents().stream().filter(s -> s.getGpa() > 3.9).findFirst();
    }

    public static void main(String[] args) {

        Optional<Student> studentOptional = findStudentGradeLevel();

        if (studentOptional.isPresent()) {
            System.out.println(studentOptional.get().getName() + " " + studentOptional.get().getGpa());
        }
    }
}
