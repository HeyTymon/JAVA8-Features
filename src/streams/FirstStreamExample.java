package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FirstStreamExample {

    static Predicate<Student> predicateGrade = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> predicateGPA = student -> student.getGpa() >= 3.9;

    public static void main(String[] args) {

       Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
               .stream()
               .filter(predicateGrade)
               .filter(predicateGPA)
               .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println(studentMap);
    }
}
